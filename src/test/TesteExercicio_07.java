package test;

import org.junit.Test;
import static org.junit.Assert.*;

import exercicios_qaacademy.Exercicio07;

public class TesteExercicio_07 {
	Exercicio07 ex7 = new Exercicio07();
	
	@Test
	public void calculaInssTeste() {
		
		assertEquals("78,38", ex7.calculaSalario(1045.00));
		assertEquals("94,05", ex7.calculaSalario(1045.01));
		assertEquals("250,75", ex7.calculaSalario(2089.61));
		assertEquals("376,13", ex7.calculaSalario(3134.41));
				
	}
}
