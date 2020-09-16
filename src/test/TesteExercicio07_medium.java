package test;

import org.junit.Assert;
import org.junit.Test;

import exercicios_qaacademy.Exercicio07_medium;

public class TesteExercicio07_medium {
	

	@Test
	public void testeFatorial() {
		Exercicio07_medium ex7 = new Exercicio07_medium();
		
		Assert.assertEquals("Valor incorreto",120, ex7.calculaFatorial(5));

	}
}
