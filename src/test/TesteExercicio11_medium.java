package test;

import org.junit.Assert;
import org.junit.Test;

import exercicios_qaacademy.Exercicio11_medium;

public class TesteExercicio11_medium {
	
	@Test
	public void testeFibonacci() {
		
		Exercicio11_medium ex11 = new Exercicio11_medium();
		Assert.assertEquals("Valores incorretos",3, ex11.calculaFibonacci(5));
		
	}

}
