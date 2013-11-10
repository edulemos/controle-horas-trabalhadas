package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Registro;

public class Convert {
    
    Registro registro =  new Registro( );
    Calc c = new Calc();

    public Registro strToObj(Integer id, Date data, String entrada, String saidaAlmoco, String voltaAlmoco, String saida, String horaExtra, String saidas, Date data2) {
        registro.setId(id);
        registro.setData(dataSql(data));
        registro.setEntrada(strTimeToMinut(entrada));
        registro.setSaidaAlmoco(strTimeToMinut(saidaAlmoco));
        registro.setVoltaAlmoco(strTimeToMinut(voltaAlmoco));
        registro.setSaida(strTimeToMinut(saida));
        registro.setHoraExtra(strTimeToMinut(horaExtra));
        registro.setSaidas(strTimeToMinut(saidas));
        
        if (  entrada.length()      == 5 && !"00:00".equals(entrada) 
           && saidaAlmoco.length()  == 5 && !"00:00".equals(saidaAlmoco)
           && voltaAlmoco.length()  == 5 && !"00:00".equals(voltaAlmoco)
           && saida.length()        == 5 && !"00:00".equals(saida)) {
            
            registro.setTotalTrabalhado(c.trabalhado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas));
           
            if (isBusinessDay(data)) {
                registro.setTotalCalculado(c.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas));
            } else {
                registro.setTotalCalculado(c.trabalhadoDiaExtra(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas));
            }

        } else {
            
            registro.setTotalTrabalhado(0);
            registro.setTotalCalculado(0);
            
        }

        return registro;
    }

    public Integer strTimeToMinut(String time) {
        try {
            if (!":".equals(time.trim())) {
                Integer horas = Integer.parseInt(time.split(":")[0]);
                Integer minutos = Integer.parseInt(time.split(":")[1]);
                return (horas * 60) + minutos;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }   

    public java.sql.Date dataSql(Date data) {
        java.sql.Date sqlDate = new java.sql.Date(data.getTime());
        return sqlDate;
    }

    public String minToHoraStr(Integer time) {
        String horas = "";
        String minutos = "";

        if (null != time && time > 0) {

            if (time >= 60) {
                horas = "" + time / 60;
            } else {
                horas = "00";
            }

            if (time >= 60) {
                minutos = "" + time % 60;
            } else {
                minutos = "" + time;
            }

            if (horas.length() == 1) {
                horas = "0" + horas;
            }
            
            if (minutos.length() == 1) {
                minutos = "0" + minutos;
            }
            
            return horas + ":" + minutos;
            
        } else {
            
            return "00:00";
            
        }
        
    }
    

	public boolean isBusinessDay(java.util.Date data) {

            SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat sd1 = new SimpleDateFormat("EEEE");

            //Feriados nacionais que caem no meio da semana cadastrados no xml
            ArrayList<String> feriados = new XmlReader().listaFeriados();
           
            if( "Domingo".equals(sd1.format(data)) || "Sábado".equals(sd1.format(data)) ||
                "Sunday".equals(sd1.format(data)) || "Saturday".equals(sd1.format(data)) || feriados.contains(sd.format(data)))
             return false;
            else		
             return true;
		
	}
    
    
   
}
