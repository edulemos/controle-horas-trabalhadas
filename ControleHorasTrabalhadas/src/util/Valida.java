package util;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valida{

        public String validaFields(Date data, String entrada, String saidaAlmoco, String voltaAlmoco
                                  ,String saida, String horaExtra, String saidas) {
         
         Convert c = new Convert();
            
        String erros = "";       
        if(data == null)erros += "Data Inválida!\n";
        if(data.after(new Date()))erros += "Data Selecionada maior do que a data atual!\n";
        if(entrada.length() != 5) erros += "Hora Entrada Obrigatória!\n";
        if(!validaHora(entrada)) erros += "Hora Entrada Inválida!\n";
        if(!validaHora(saidaAlmoco)) erros += "Hora Saída Almoço Inválida!\n";
        if(!validaHora(voltaAlmoco)) erros += "Hora Volta Almoço Inválida!\n";
        if(!validaHora(saida))  erros += "Hora Saída Inválida!\n";
        if(!validaHora(horaExtra))  erros += "Hora Extra Inválida!\n";
        if(!validaHora(saidas))  erros += "Hora Saídas Inválida!\n";
        
        if("".equals(erros) && !"".equals(entrada) && !"".equals(saidaAlmoco) && c.strTimeToMinut(saidaAlmoco) < c.strTimeToMinut(entrada) ){
         erros += "Hora Saída Almoço Menor que Hora de Entrada!\n";   
        }
        
        if("".equals(erros) && !"".equals(saidaAlmoco) && !"".equals(voltaAlmoco) && c.strTimeToMinut(saidaAlmoco) > c.strTimeToMinut(voltaAlmoco) ){
         erros += "Hora de Volta do Almoço Menor do que Hora de Saida do Almoço!\n";   
        }
        
        if("".equals(erros) && !"".equals(saida) && !"".equals(voltaAlmoco) && c.strTimeToMinut(saida) < c.strTimeToMinut(voltaAlmoco) ){
         erros += "Hora de Saida Menor do que Hora de Volta do Almoço!\n";   
        }
        
        
        
        return erros;
    }
        
    public boolean validaHora(String time) {
        if (time.length() == 0) {
            return true;
        } else {
            Pattern pattern = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9]");
            Matcher matcher = pattern.matcher(time);
            return matcher.matches();
        }
    }
    
    public String validaDatas(Date dataini, Date datafim) {        
        String erros = "";       
        if(dataini == null)erros += "Data Inicial Inválida!\n";
        if(datafim == null)erros += "Data Final Inválida!\n";
        if(dataini != null && datafim != null &&  datafim.before(dataini))erros += "Data Final menor que incial!\n";
//      if(dataini != null && datafim != null && datafim.after(dataini) && getDiasEntre(dataini, datafim) > 100 ) erros += "Período Max = 100 dias!\n";             
        return erros;
    }
    
     public static long getDiasEntre(Date dataInicial, Date dataFinal){            
        if (dataFinal.compareTo(dataInicial) < 0){  
            throw new IllegalArgumentException("A data final deve ser maior " +  
                    "ou igual a data inicial");  
        }            
        long milisecInicial = dataInicial.getTime();  
        long milisecFinal = dataFinal.getTime();  
        long dif = milisecFinal - milisecInicial;            
        return (((dif / 1000) / 60) / 60) / 24;  
    }  
         

}
