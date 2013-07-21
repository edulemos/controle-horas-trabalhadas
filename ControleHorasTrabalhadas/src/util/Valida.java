package util;

import java.util.Date;

public class Valida{

        public String validaFields(Date data, String entrada, String saidaAlmoco, String voltaAlmoco
                                  ,String saida, String horaExtra, String saidas) {
        String erros = "";       
        if(data == null)erros += "Data Inválida!\n";
        if(data.after(new Date()))erros += "Data Selecionada maior do que a data atual!\n";
        if("00:00".equals(entrada.trim())) erros += "Hora de Entrada Obrigatório!\n";
        
        return erros;
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
