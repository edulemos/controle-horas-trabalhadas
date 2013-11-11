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
            SimpleDateFormat sd2 = new SimpleDateFormat("dd/MM");
            SimpleDateFormat sd3 = new SimpleDateFormat("dd/MM/yyyy");
            HashMap<String, String> mapa = resumoDatasPeriodo(inicio, fim);
            boolean diaFechado = false;

            String str = "";
            RegistroDAO dao = new RegistroDAO();
            List<Registro> lista = dao.getLista(c.dataSql(inicio), c.dataSql(fim));
            str += "Periodo de " + sd3.format(inicio) + " a " + sd3.format(fim) + "\n\n";
            str += "Data   " + "Entr   " + "S.Alm  " + "V.Alm  " + "Saida  " + "H.Ext  " + "Saidas " + "Trab   " + "Calc " + "\n"; 
                 str += "-------------------------------------------------------------\n";

            int calculado = 0, trabalhado = 0, sobra = 0, perda = 0, horaextra = 0;
            
            for (Registro r : lista) {
                str += sd2.format(r.getData()) + "  "
                        + c.minToHoraStr(r.getEntrada()) + "  "
                        + c.minToHoraStr(r.getSaidaAlmoco()) + "  "
                        + c.minToHoraStr(r.getVoltaAlmoco()) + "  "
                        + c.minToHoraStr(r.getSaida()) + "  "
                        + c.minToHoraStr(r.getHoraExtra() ) + "  "                        
                        + c.minToHoraStr(r.getSaidas()) + "  "
                        + c.minToHoraStr(r.getTotalTrabalhado()) + "  "
                        + c.minToHoraStr(r.getTotalCalculado())+"\n";
                 str += "-------------------------------------------------------------\n";
                 
                 if (r.getEntrada()!= 0 && r.getSaidaAlmoco()!= 0 && r.getVoltaAlmoco()!= 0 && r.getSaida()!= 0     ) {
                    diaFechado = true;
                }
                                  
                if (!c.isBusinessDay(r.getData())) {

                    horaextra += r.getTotalCalculado();
                    
                } else {
                    
                    if (r.getTotalCalculado() > 480) {

                        horaextra += r.getTotalCalculado() - 480;

                    } else if (r.getTotalCalculado() < 480 && diaFechado) {
                        
                        perda += 480 - r.getTotalCalculado();
                        
                    }
                }

                calculado += r.getTotalCalculado();
                trabalhado += r.getTotalTrabalhado();
            }
            
            sobra = trabalhado - calculado;
            
            int diasPerdidos = verificaFaltas(lista,inicio,fim)*480;
            
            perda = perda + diasPerdidos;
            
            int horasPrevistas = new Integer(mapa.get("diasUteis"))*8;
                                   
                str+=  "\nPrevisto Periodo: " + c.minToHoraStr((horasPrevistas*60))+ "      Trabalhado: " + c.minToHoraStr(trabalhado)+
                  "\nHoras Extras: " + c.minToHoraStr(horaextra)  + "           Calculado: " + c.minToHoraStr(calculado) +
                  "\nPerdas: " + c.minToHoraStr(perda) + "                 Diferenca: " + c.minToHoraStr(trabalhado-calculado) +
                  "\nPrevisto Final: " +c.minToHoraStr((horasPrevistas*60)+horaextra-perda );
                
                
                str +=
                 "\n\n" + mapa.get("sabados") + " Sabado(s)" + " | " + mapa.get("domingos") + " Domingo(s)" + " | " +
                 "" + mapa.get("feriados") + " Feriado(s)" + " | " +  mapa.get("diasUteis") + " Dia(s)Utei(s)" + "\n\n" ;          
                 
              	    
             gerarArquivo(str);     
//             System.out.println(str);
        } catch (SQLException ex) {
            Logger.getLogger(GeraRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
	public void gerarArquivo(String texto) {
		try {
			File arquivo = new File("relatorio.rtf");
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
         
         public HashMap<String,String> resumoDatasPeriodo(java.util.Date inicio, java.util.Date fim){

            SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat sd1 = new SimpleDateFormat("EEEE");
            HashMap<String,String> mapaDatas = new HashMap<String, String>();
            
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
                                  
            for (int i = 1; i <= dias+1; i++) {
                if( "Domingo".equals(sd1.format(data)) || "Sunday".equals(sd1.format(data)) ){
                    domingo ++;
                }
                else if( "Sábado".equals(sd1.format(data)) ||  "Saturday".equals(sd1.format(data)) ){
                    sabado ++;
                }
                else if( feriados.contains(sd.format(data))){
                    feriado ++;
                }
                else{
                    diasUteis ++;
                }  
                
                data = new Date(ano, mes, dia + i);
            }
            
            mapaDatas.put("sabados", String.valueOf(sabado));
            mapaDatas.put("domingos", String.valueOf(domingo));
            mapaDatas.put("feriados", String.valueOf(feriado));
            mapaDatas.put("diasUteis", String.valueOf(diasUteis));
            
            return  mapaDatas;
	}
         
       public static long getDiasEntre(Date dataInicial, Date dataFinal){            
        if (dataFinal.compareTo(dataInicial) < 0){  
            throw new IllegalArgumentException("A data final deve ser maior ou igual a data inicial");  
        }            
        long milisecInicial = dataInicial.getTime();  
        long milisecFinal = dataFinal.getTime();  
        long dif = milisecFinal - milisecInicial;            
        return (((dif / 1000) / 60) / 60) / 24;  
    }  
       
          @SuppressWarnings("deprecation")
	public static void main(String args[]) throws ParseException{
              
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
    	java.util.Date ini = new java.util.Date(113, 4, 21);
    	java.util.Date fim = new java.util.Date(113, 5, 20);
   	
         new GeraRelatorio().relatorio(ini, fim);       
                
    }             

    private int verificaFaltas(List<Registro> lista, Date inicio, Date fim) throws ParseException {

        int count = 0;
        ArrayList<String> feriados = new XmlReader().listaFeriados();            
        ArrayList<String> listaDiasPeriodo = new ArrayList<String>();
        ArrayList<String> listaDiasTralhados = new ArrayList<String>();

        DateFormat sd = new SimpleDateFormat ("dd-MM-yyyy");  
        Date dt1 = inicio;  
        
        Date dt2 = new Date();  
        
        if(dt2.after(fim))
           dt2=fim;
        
        Calendar cal = Calendar.getInstance();  
        cal.setTime (dt1);  
        
        //CARREGA DATAS DO PERIODO
        for (Date dt = dt1; dt.compareTo (dt2) <= 0; ) {              
            listaDiasPeriodo.add(sd.format (dt));
            cal.add (Calendar.DATE, +1);  
            dt = cal.getTime();  
        }                 
       
        //CARREGA DATAS REGISTRADAS
        for (Registro reg : lista) {
            listaDiasTralhados.add(sd.format(reg.getData()));
        }
        
        //COMPARA DATAS
        for (String diaPeriodo : listaDiasPeriodo) {
            
            Date data = sd.parse(diaPeriodo);
            
            // SE DATA NÃO TIVER NA LISTA E NÃO FOR SABADO, DOMINGO OU FERIADO ADICIONO FALTA
            if(!listaDiasTralhados.contains(diaPeriodo) && data.getDay()!=6 && data.getDay()!=0 && !feriados.contains(sd.format(data))){
                count ++;
            }
            
        }
        
        
     
        return count;

    }
      
    
}










