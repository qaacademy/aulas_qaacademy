package test;

import org.junit.Test;

import exercicios_qaacademy.Exercicio06_medium_refatorado;

public class TesteExercicio06_medium {

	Exercicio06_medium_refatorado ex6 = new Exercicio06_medium_refatorado();

	@Test
	public void testeExercicio06() {
		int[] numeros = { 10, 45, 88, 88, 4, 99, 99 };
		ex6.encontraMaior(numeros);
		ex6.encontraNumerosIguais(numeros);
	}

}
