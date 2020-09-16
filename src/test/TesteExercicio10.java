package test;

import org.junit.Assert;
import org.junit.Test;

import exercicios_qaacademy.Exercicio10;

public class TesteExercicio10 {
	Exercicio10 ex10 = new Exercicio10();
	
	@Test
	public void testaExercicio10() {
		double valorInvestimento = 1558.00;
		double juros=0.03;
		int quantidadeAnos = 10;
		
		
		Assert.assertEquals("Valor dos juros retornado com erro","467,4",
				ex10.calcularInvestimento(valorInvestimento,juros,quantidadeAnos));

	}

	
	
	
	
	
	
	
	
}
