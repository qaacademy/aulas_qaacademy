package test;

import org.junit.Assert;
import org.junit.Test;

import exercicios_qaacademy.Exercicio02_Medium;
import utils.Utilidades;

public class TesteExercicio02_Medium {

	@Test
	public void testeInvestimentoJusrosCompostos() {
		Exercicio02_Medium ex02M = new Exercicio02_Medium();
		double valorInvestido = 100000.00;
		double taxaJuros = 0.05;
		int tempoInvestido = 3;
		Assert.assertEquals("Valor incorreto", "115762,5", 
				Utilidades.formatarDouble(ex02M.calculaInvestimentoJurosCompostos(valorInvestido,taxaJuros,tempoInvestido)));
		
		
		
	}

}
