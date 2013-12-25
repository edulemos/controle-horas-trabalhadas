package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Registro;
import dao.RegistroDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class GeraRelatorio {

    public void relatorio(java.util.Date inicio, java.util.Date fim) throws ParseException {
        try {
            Convert c = new Convert();
            SimpleDateFormat sd1 = new SimpleDateFormat("dd/MM");
            SimpleDateFormat sd2 = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sd3 = new SimpleDateFormat("dd.MM.yyyy");

            HashMap<String, String> mapa = resumoDatasPeriodo(inicio, fim);
            List<String> listaFaltas = listaDiasUteis(inicio,fim);

            boolean diaFechado = false;
            
            String str = "";
            RegistroDAO dao = new RegistroDAO();
            List<Registro> lista = dao.getLista(c.dataSql(inicio), c.dataSql(fim));
            str += "Periodo de " + sd2.format(inicio) + " a " + sd2.format(fim) + "\n\n";
            str += "Data   " + "Entr   " + "S.Alm  " + "V.Alm  " + "Saida  " + "H.Ext  " + "Perda  " + "Trab   " + "Calc " + "\n";
            str += "-------------------------------------------------------------\n";

            int calculado = 0, trabalhado = 0, sobra = 0, perdaMes = 0, horaExtraMes = 0, perdaDia = 0, horaExtraDia = 0;

            for (Registro r : lista) {
                           
            listaFaltas.remove(sd2.format(r.getData()));
               
                if (r.getEntrada() != 0 && r.getSaidaAlmoco() != 0 && r.getVoltaAlmoco() != 0 && r.getSaida() != 0) {
                    diaFechado = true;
                }
                
                 perdaDia = 0;
                 horaExtraDia = 0;

                if (!c.isBusinessDay(r.getData())) {
                    horaExtraDia = r.getTotalCalculado();
                    horaExtraMes += horaExtraDia;
                } else {
                    if (r.getTotalCalculado() > 480) {
                        horaExtraDia = r.getTotalCalculado() - 480;
                        horaExtraMes += horaExtraDia;
                    } else if (r.getTotalCalculado() < 480 && diaFechado) {
                        perdaDia = 480 - r.getTotalCalculado();
                        perdaMes += perdaDia;
                    }
                }
                
                 str += sd1.format(r.getData()) + "  "
                        + c.minToHoraStr(r.getEntrada()) + "  "
                        + c.minToHoraStr(r.getSaidaAlmoco()) + "  "
                        + c.minToHoraStr(r.getVoltaAlmoco()) + "  "
                        + c.minToHoraStr(r.getSaida()) + "  "
                        + c.minToHoraStr(horaExtraDia) + "  "
                        + c.minToHoraStr(perdaDia) + "  "
                        + c.minToHoraStr(r.getTotalTrabalhado()) + "  "
                        + c.minToHoraStr(r.getTotalCalculado()) + "\n";
                str += "-------------------------------------------------------------\n";

                calculado += r.getTotalCalculado();
                trabalhado += r.getTotalTrabalhado();
            }
            
            if(listaFaltas.size()>0){
                str += "FALTAS-------------------------------------------------------\n";
            }
            
            for (String data : listaFaltas) {            
                            str +=
                         sd1.format(sd2.parse(data))+"  "                  
                        + c.minToHoraStr(0) + "  "
                        + c.minToHoraStr(0) + "  "
                        + c.minToHoraStr(0) + "  "
                        + c.minToHoraStr(0) + "  "
                        + c.minToHoraStr(0) + "  "
                        + c.minToHoraStr(480) + "  "
                        + c.minToHoraStr(0) + "  "
                        + c.minToHoraStr(0) + "\n";
                str += "-------------------------------------------------------------\n";                                                      
            }

            sobra = trabalhado - calculado;

            int faltas = listaFaltas.size() * 480;

            perdaMes = perdaMes +  faltas;
            
            int horasPrevistas = new Integer(mapa.get("diasUteis")) * 8;

            str += "\nPrevisto Periodo: " + c.minToHoraStr((horasPrevistas * 60)) + "      Trabalhado: " + c.minToHoraStr(trabalhado)
                    + "\nHoras Extras: " + c.minToHoraStr(horaExtraMes) + "           Calculado: " + c.minToHoraStr(calculado)
                    + "\nPerdas: " + c.minToHoraStr(perdaMes) + "                 Diferenca: " + c.minToHoraStr(trabalhado - calculado)
                    + "\nPrevisto Final: " + c.minToHoraStr((horasPrevistas * 60) + horaExtraMes - perdaMes);

            str +=
                    "\n\n" + mapa.get("sabados") + " Sabado(s)" + " | " + mapa.get("domingos") + " Domingo(s)" + " | "
                    + "" + mapa.get("feriados") + " Feriado(s)" + " | " + mapa.get("diasUteis") + " Dia(s)Utei(s)" + "\n\n";

            
            String nomeRel = "Relatorio " + sd3.format(inicio)+"_"+sd3.format(fim);
            gerarArquivo(str,nomeRel);
          //System.out.println(str);


        } catch (SQLException ex) {
            Logger.getLogger(GeraRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gerarArquivo(String texto,String nome) {
        try {
            File arquivo = new File(nome+".rtf");
            if (arquivo.exists()) {
                arquivo.delete();
            }
            BufferedWriter out = new BufferedWriter(new FileWriter(arquivo));
            out.write(texto);
            out.close();
            java.awt.Desktop.getDesktop().open(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, String> resumoDatasPeriodo(java.util.Date inicio, java.util.Date fim) {

        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sd1 = new SimpleDateFormat("EEEE");
        HashMap<String, String> mapaDatas = new HashMap<String, String>();

        int diasUteis = 0;
        int sabado = 0;
        int domingo = 0;
        int feriado = 0;

        //Feriados nacionais que caem no meio da semana cadastrados no xml
        ArrayList<String> feriados = new XmlReader().listaFeriados();

        Date data = inicio;
        int ano = inicio.getYear();
        int mes = inicio.getMonth();
        int dia = inicio.getDate();
        int dias = (int) getDiasEntre(inicio, fim);

        for (int i = 1; i <= dias + 1; i++) {
            if ("Domingo".equals(sd1.format(data)) || "Sunday".equals(sd1.format(data))) {
                domingo++;
            } else if ("Sábado".equals(sd1.format(data)) || "Saturday".equals(sd1.format(data))) {
                sabado++;
            } else if (feriados.contains(sd.format(data))) {
                feriado++;
            } else {
                diasUteis++;
            }
            data = new Date(ano, mes, dia + i);
        }
        mapaDatas.put("sabados", String.valueOf(sabado));
        mapaDatas.put("domingos", String.valueOf(domingo));
        mapaDatas.put("feriados", String.valueOf(feriado));
        mapaDatas.put("diasUteis", String.valueOf(diasUteis));

        return mapaDatas;
    }

    public static long getDiasEntre(Date dataInicial, Date dataFinal) {
        if (dataFinal.compareTo(dataInicial) < 0) {
            throw new IllegalArgumentException("A data final deve ser maior ou igual a data inicial");
        }
        long milisecInicial = dataInicial.getTime();
        long milisecFinal = dataFinal.getTime();
        long dif = milisecFinal - milisecInicial;
        return (((dif / 1000) / 60) / 60) / 24;
    }
    
     private List<String> listaDiasUteis(Date inicio,Date fim) throws ParseException {

        int count = 0;
        ArrayList<String> feriados = new XmlReader().listaFeriados();
        ArrayList<String> listaDiasPeriodo = new ArrayList<String>();
        ArrayList<String> listaDiasPeriodoAux = new ArrayList<String>();

        DateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat sd1 = new SimpleDateFormat("dd-MM-yyyy");

        Date dt1 = inicio;
        Date dt2 = new Date();

        if (dt2.after(fim)) {
            dt2 = fim;
        }
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt1);

        //CARREGA DATAS DO PERIODO
        for (Date dt = dt1; dt.compareTo(dt2) <= 0;) {
            listaDiasPeriodo.add(sd.format(dt));
            cal.add(Calendar.DATE, +1);
            dt = cal.getTime();
        }

        //COMPARA DATAS
        for (String diaPeriodo : listaDiasPeriodo) {
            Date data = sd.parse(diaPeriodo);
           
            if (data.getDay() != 6 && data.getDay() != 0 && !feriados.contains(sd1.format(data))) {
               listaDiasPeriodoAux.add(diaPeriodo);
            }
            
        }
        return listaDiasPeriodoAux;
    }

    @SuppressWarnings("deprecation")
    public static void main(String args[]) throws ParseException {
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date ini = new java.util.Date(113, 11, 21);
        java.util.Date fim = new java.util.Date(114, 0, 20);
        
      new GeraRelatorio().relatorio(ini, fim);
      
    }
    
}
