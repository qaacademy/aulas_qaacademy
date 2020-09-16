package test;

import org.junit.Assert;
import org.junit.Test;

import exercicios_qaacademy.Exercicio07;

public class TesteExercicio07 {

	@Test
	public void testeExercicio07() {
		Exercicio07 exercicio07 = new Exercicio07();
		Assert.assertEquals("78,38", exercicio07.calculaInssString(1045.00));
		Assert.assertEquals("94,05", exercicio07.calculaInssString(1045.01));
		Assert.assertEquals("250,75", exercicio07.calculaInssString(2089.61));
		Assert.assertEquals("438,82", exercicio07.calculaInssString(3134.41));
		Assert.assertEquals("854,14", exercicio07.calculaInssString(76101));

	}
}
