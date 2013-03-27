package util;

public class Calc {

static Convert c = new Convert();

    public int calculado(String entrada, String saidaAlmoco, String voltaAlmoco, String saida, String horaExtra, String saidas){
        int minEntrada = c.strTimeToMinut(entrada);
        int minSaidaAlmoco = c.strTimeToMinut(saidaAlmoco);
        int minvoltaAlmoco = c.strTimeToMinut(voltaAlmoco);
        int minSaida = c.strTimeToMinut(saida);
        int minHoraExtra = c.strTimeToMinut(horaExtra);
        int minSaidas = c.strTimeToMinut(saidas);
        int minTempoAlmoco = 0;
        int minSobraAlm = 0;
        int minTrabalhado = 0;
        int minApurado = 0;
        int minAntesAlmoco = 0;
        int minDepoisAlmoco = 0;
        int diferenca = 0;

        minTempoAlmoco = minvoltaAlmoco - minSaidaAlmoco;

        if (minTempoAlmoco < 60) {
            minSobraAlm = 60 - minTempoAlmoco;
        }
        if (minSobraAlm > 15) {
            minSobraAlm = 15;
        }
        if (minSaida + minSobraAlm >= 1095) {
            minSaida = 1095;
            minSaida = minSaida - minSobraAlm;
        }
        minAntesAlmoco = minSaidaAlmoco - minEntrada;
        minDepoisAlmoco = minSaida - minvoltaAlmoco;

        if (minTempoAlmoco < 45) {
            diferenca = 45 - minTempoAlmoco;
        }
        if (minTempoAlmoco > 60) {
            diferenca = minTempoAlmoco - 60;
        }
        minTrabalhado = minAntesAlmoco + minDepoisAlmoco;

        if (minTempoAlmoco < 60) {
            minTrabalhado = minTrabalhado - diferenca;
        }
        if (minTrabalhado > 480) {
            minTrabalhado = 480;
        }        
        
        minTrabalhado = minTrabalhado + minHoraExtra;
        
        minTrabalhado = minTrabalhado - minSaidas;
        
        return minTrabalhado;
    }

    public int trabalhado(String entrada, String saidaAlmoco, String voltaAlmoco, String saida, String horaExtra, String saidas) {
        int minEntrada = c.strTimeToMinut(entrada);
        int minSaidaAlmoco = c.strTimeToMinut(saidaAlmoco);
        int minvoltaAlmoco = c.strTimeToMinut(voltaAlmoco);
        int minSaida = c.strTimeToMinut(saida);
        int minHoraExtra = c.strTimeToMinut(horaExtra);
        int minSaidas = c.strTimeToMinut(saidas);
        int minTrabalhado = 0;
        int minAntesAlmoco = 0;
        int minDepoisAlmoco = 0;

        minAntesAlmoco = minSaidaAlmoco - minEntrada;
        minDepoisAlmoco = minSaida - minvoltaAlmoco;
        minTrabalhado = minAntesAlmoco + minDepoisAlmoco;
        minTrabalhado = minTrabalhado + minHoraExtra;
        minTrabalhado = minTrabalhado - minSaidas;

        return minTrabalhado;
    }
    
   
}
