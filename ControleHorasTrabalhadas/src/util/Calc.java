package util;

public class Calc {

static Convert c = new Convert();

    public int calculado(String entrada, String saidaAlmoco,
			String voltaAlmoco, String saida, String horaExtra, String saidas) {
		int minEntrada = c.strTimeToMinut(entrada);
		int minSaidaAlmoco = c.strTimeToMinut(saidaAlmoco);
		int minvoltaAlmoco = c.strTimeToMinut(voltaAlmoco);
		int minSaida = c.strTimeToMinut(saida);
		int minHoraExtra = c.strTimeToMinut(horaExtra);
		int minSaidas = c.strTimeToMinut(saidas);
		int minTempoAlmoco = 0;
		int compensacao = 0;
                int desconto = 0;
                int trabalhado = 0;
                int diferenca = 0;
		
		// inicia o dia com 8hs
		int calculado = 480; 
		
		//calcula o tempo gasto no almoco
		minTempoAlmoco = minvoltaAlmoco - minSaidaAlmoco;
					
		// desconta o atraso
		if (minEntrada > 540) {
			calculado -= minEntrada - 540;
		}
		
		// saiu antes de 18:00 desconta o excedente
		if(minSaida < 1080) {
		  calculado -= 1080 - minSaida;
		}
		
		// gastou mais de 1h de almoço desconta o excedente
		if(minTempoAlmoco > 60) {
			calculado -= minTempoAlmoco - 60;
		}
                
		// calcula a possivel compensacao apos 18:00
		if(minSaida > 1080){
			compensacao += minSaida - 1080;
		}
		
		// calcula a possivel compensacao no almoço
		if(minTempoAlmoco >= 45 && minTempoAlmoco < 60){
			compensacao += 60 - minTempoAlmoco;
		}else if(minTempoAlmoco < 45){
                    compensacao += 15;
                }				
		
		// ajusta a compensacao caso seja maior que 15min
		if( compensacao > 15){
			compensacao = 15;			
		}
		
		//caso trabalhado - de 8hs aplica as compensações
		if( calculado < 480){
			calculado += compensacao;
		}
		
		//caso trabalho + compensacao ultrapasse 480 
		if( calculado > 480){
			calculado = 480;
		}                
		
                //total do dia
                trabalhado = trabalhado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
                        
                //desconta as saidas
                calculado -= minSaidas;
                
                //verifica a diferença entre o trabalhao e o calculado
                diferenca = trabalhado - calculado;
                
                // caso a hora extra maior do que a sobra e dado o corte
                if( minHoraExtra > diferenca ){
                    minHoraExtra = diferenca;
                }
                
                //aplica a hora extra
		calculado += minHoraExtra;
		
		return calculado;
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
        
        return minTrabalhado;
    }
    
   
}
