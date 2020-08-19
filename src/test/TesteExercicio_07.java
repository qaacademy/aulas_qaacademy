package test;

import org.junit.Test;
import static org.junit.Assert.*;

import exercicios_qaacademy.Exercicio07;

public class TesteExercicio_07 {
	Exercicio07 ex7 = new Exercicio07();
	
	@Test
	public void calculaInssTeste() {
		
		assertEquals("78", ex7.calculaSalario(1045.00).toString());
		assertEquals("94", ex7.calculaSalario(1045.01).toString());
		assertEquals("250", ex7.calculaSalario(2089.61).toString());
		assertEquals("438", ex7.calculaSalario(3134.41).toString());
				
	}
	

//	@Test
//	public void calculaInssTeste1() {
//	assertEquals("94", ex7.calculaSalario(1045.01).toString());
//	}
//	
//
//	@Test
//	public void calculaInssTeste2() {
//	
//	assertEquals("250", ex7.calculaSalario(2089.61).toString());
//	}
//	
//
//	@Test
//	public void calculaInssTeste3() {
//	assertEquals("438", ex7.calculaSalario(3134.41).toString());
//	}
//	

}
