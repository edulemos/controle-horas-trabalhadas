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

public class GeraRelatorio {
    
    public void relatorio(java.util.Date inicio, java.util.Date fim) {
        try {
            Convert c = new Convert();
            SimpleDateFormat sd2 = new SimpleDateFormat("dd/MM");
            SimpleDateFormat sd3 = new SimpleDateFormat("dd/MM/yyyy");

            String str = "";
            RegistroDAO dao = new RegistroDAO();
            List<Registro> lista = dao.getLista(c.dataSql(inicio), c.dataSql(fim));
            str += "Periodo de " + sd3.format(inicio) + " a " + sd3.format(fim) + "\n\n";
            str += "Data   " + "Entr   " + "S.Alm  " + "V.Alm  " + "Saida  " + "H.Ext  " + "Saidas " + "Trab   " + "Calc" + "\n"; 
            str += "-------------------------------------------------------------\n";

            int calculado = 0, trabalhado = 0, sobra = 0, perda = 0, horaextra = 0;
            
            for (Registro r : lista) {
                str += sd2.format(r.getData()) + "  "
                        + c.minToDateStr(r.getEntrada()) + "  "
                        + c.minToDateStr(r.getSaidaAlmoco()) + "  "
                        + c.minToDateStr(r.getVoltaAlmoco()) + "  "
                        + c.minToDateStr(r.getSaida()) + "  "
                        + c.minToDateStr(r.getHoraExtra()) + "  "
                        + c.minToDateStr(r.getSaidas()) + "  "
                        + c.minToDateStr(r.getTotalTrabalhado()) + "  "
                        + c.minToDateStr(r.getTotalCalculado())+"\n";
                 str += "-------------------------------------------------------------\n";
                 
                 
                 if(!c.isBusinessDay(r.getData()))
                 {
                	 horaextra += r.getTotalCalculado();
                 }
                 else
                 {
                	if( r.getTotalCalculado() > 480 ){
                		horaextra += r.getTotalCalculado() - 480;
                	 }
                	else if( r.getTotalCalculado() < 480 )
                		perda += 480 - r.getTotalCalculado();
                 }
                 
                 calculado += r.getTotalCalculado();
                 trabalhado += r.getTotalTrabalhado();
            }
            
            sobra = trabalhado - calculado;
            
            str += "=======RESUMO=======\n\n";
            
            str += " Trabalhado: "  + c.minToDateStr(trabalhado) + "\n" +
              	    "  Calculado: " + c.minToDateStr(calculado)  + "\n" +
              	    "   Sobrando: "   + c.minToDateStr(sobra)    + "\n" +
              	    "    Devendo: " + c.minToDateStr(perda)      + "\n" +
              	    " Hora Extra: " + c.minToDateStr(horaextra);
            
            str += "\n\n====================";
            
              gerarArquivo(str);            
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
        
        
         @SuppressWarnings("deprecation")
	public static void main(String args[]){
    	java.util.Date ini = new java.util.Date(113, 2, 21);
    	java.util.Date fim = new java.util.Date(113, 3, 20);
    	new GeraRelatorio().relatorio(ini, fim);       
                
    }
    
}










