package util;

import dao.RegistroDAO;
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

public class GeraRelatorio {
    
    public void relatorio(java.util.Date inicio, java.util.Date fim) {
        try {
            Convert c = new Convert();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
            SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

            String str = "";
            RegistroDAO dao = new RegistroDAO();
            List<Registro> lista = dao.getLista(c.dataSql(inicio), c.dataSql(fim));
            str += "Periodo de " + sd.format(inicio) + " a " + sd.format(fim) + "\n\n";
            str += "Data   " + "Entr   " + "S.Alm  " + "V.Alm  " + "Saida  " + "H.Ext  " + "Saidas " + "Trab   " + "Calc" + "\n"; 
            str += "-------------------------------------------------------------\n";

            int calculado = 0, trabalhado = 0, diferenca = 0;
            
            for (Registro r : lista) {
                str += sdf.format(r.getData()) + "  "
                        + c.minToDateStr(r.getEntrada()) + "  "
                        + c.minToDateStr(r.getSaidaAlmoco()) + "  "
                        + c.minToDateStr(r.getVoltaAlmoco()) + "  "
                        + c.minToDateStr(r.getSaida()) + "  "
                        + c.minToDateStr(r.getHoraExtra()) + "  "
                        + c.minToDateStr(r.getSaidas()) + "  "
                        + c.minToDateStr(r.getTotalTrabalhado()) + "  "
                        + c.minToDateStr(r.getTotalCalculado())
                        + "\n";
                 str += "-------------------------------------------------------------\n";
                 
                 calculado += r.getTotalCalculado();
                 trabalhado += r.getTotalTrabalhado();
            }
            diferenca = trabalhado - calculado;
            str += "Trabalhado: " + c.minToDateStr(trabalhado) + " / Calculado: " + c.minToDateStr(calculado)+ " / Diferenca: " + c.minToDateStr(diferenca);
            
            gerarArquivo(str);            
        } catch (SQLException ex) {
            Logger.getLogger(GeraRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void gerarArquivo(String texto) {
        try {
            File arquivo =  new File("relatorio.rtf");
            if (arquivo.exists()){
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
    
    public static void main(String args[]){
        java.util.Date ini = new java.util.Date();
        java.util.Date fim = new java.util.Date();
        fim.setMonth(ini.getMonth()+1);
        new GeraRelatorio().relatorio(ini, fim);        
    }
    
}
