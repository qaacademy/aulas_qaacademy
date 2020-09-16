package test;

import org.junit.Assert;
import org.junit.Test;

import exercicios_qaacademy.Exercicio11;


public class TesteExercicio11 {
	
	@Test
	public void testeSomaNumero() {

		Exercicio11 ex11 = new Exercicio11();
		
		Assert.assertEquals("Erro ao comparar os dois números",16, ex11.somaDois(10));
	}

}
