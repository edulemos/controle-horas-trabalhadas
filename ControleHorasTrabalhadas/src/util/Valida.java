package util;

import java.util.Date;

public class Valida{

    public String validaFields(Date data, String entrada, String saidaAlmoco,
            String voltaAlmoco, String saida, String horaExtra, String saidas) {        
        String erros = "";       
        if(data == null)erros += "Data Inválida!\n";
        if(":".equals(entrada.trim())) erros += "Hora Entrada Inválida!\n";
        if(validaHoraStr(entrada)) erros += "Hora Entrada Inválida!\n";
        if(validaHoraStr(saidaAlmoco)) erros += "Hora Saída Almoço Inválida!\n";
        if(validaHoraStr(voltaAlmoco)) erros += "Hora Volta Almoço Inválida!\n";
        if(validaHoraStr(saida)) erros += "Hora Saída Inválida!\n";
        if(validaHoraStr(horaExtra)) erros += "Hora Extra Inválida!\n";
        if(validaHoraStr(saidas)) erros += "Hora Saídas Inválida!\n";
        return erros;
    }
    
    public String validaDatas(Date dataini, Date datafim) {        
        String erros = "";       
        if(dataini == null)erros += "Data Inicial Inválida!\n";
        if(datafim == null)erros += "Data Final Inválida!\n";
        if(dataini != null && datafim != null &&  datafim.before(dataini))erros += "Data Final menor que incial!\n";
        if(dataini != null && datafim != null && datafim.after(dataini) && getDiasEntre(dataini, datafim) > 100 ) erros += "Período Max = 100 dias!\n";             
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
    
    private boolean validaHoraStr(String time) {
        boolean b = false;
        try {
            if (!":".equals(time.trim())) {
                Integer hora = new Integer(time.split(":")[0]);
                Integer minutos = new Integer(time.split(":")[1]);
                if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
                    b = true;
                }
            }
        } catch (Exception e) {
            b = true;
        }
        return b;
    }
    
}
