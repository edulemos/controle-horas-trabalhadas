package util;

import java.util.Date;
import model.Registro;

public class Convert {
    
    Registro registro =  new Registro( );
    Calc c = new Calc();

    public Registro strToObj(Integer id, Date data, String entrada, String saidaAlmoco, String voltaAlmoco, String saida, String horaExtra, String saidas) {
        registro.setId(id);
        registro.setData(dataSql(data));
        registro.setEntrada(strTimeToMinut(entrada));
        registro.setSaidaAlmoco(strTimeToMinut(saidaAlmoco));
        registro.setVoltaAlmoco(strTimeToMinut(voltaAlmoco));
        registro.setSaida(strTimeToMinut(saida));
        registro.setHoraExtra(strTimeToMinut(horaExtra));
        registro.setSaidas(strTimeToMinut(saidas));
        registro.setTotalTrabalhado(c.trabalhado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas));
        registro.setTotalCalculado(c.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas));
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
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        return sqlDate;
    }

    public String minToDateStr(Integer time) {
        String horas = "";
        String minutos = "";

        if (null != time && time > 0) {

            if (time > 60) {
                horas = "" + time / 60;
            } else {
                horas = "00";
            }

            if (time > 60) {
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

    public Registro strToObj( Date data, String entrada, String saidaAlmoco, String voltaAlmoco, String saida, String horaExtra, String saidas) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
