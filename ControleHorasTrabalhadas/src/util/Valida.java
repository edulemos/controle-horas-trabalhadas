package util;

import java.util.Date;

public class Valida{

        public String validaFields(Date data, String entrada, String saidaAlmoco, String voltaAlmoco
                                  ,String saida, String horaExtra, String saidas) {
        String erros = "";       
        if(data == null)erros += "Data Inválida!\n";
        if(data.after(new Date()))erros += "Data Selecionada maior do que a data atual!\n";
        if(entrada.length() != 5) erros += "Hora Entrada Obrigatória!\n";
        if(!horaOK(saidaAlmoco)) erros += "Hora Saída Almoço Inválida!\n";
        if(!horaOK(voltaAlmoco)) erros += "Hora Volta Almoço Inválida!\n";
        if(!horaOK(saida))  erros += "Hora Saída Inválida!\n";
        if(!horaOK(horaExtra))  erros += "Hora Extra Inválida!\n";
        if(!horaOK(saidas))  erros += "Hora Saídas Inválida!\n";
        
        return erros;
    }
        
    public boolean horaOK(String hora){    
        if(null == hora || (hora.length() > 0 && hora.length() != 5))
            return false;
        else
            return true;
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
