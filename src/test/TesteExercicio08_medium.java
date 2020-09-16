package test;

import org.junit.Test;

import exercicios_qaacademy.Exercicio08_medium;
import exercicios_qaacademy.Exercicio09_medium;

public class TesteExercicio08_medium {
	Exercicio08_medium ex8 = new Exercicio08_medium();
	Exercicio09_medium ex9 = new Exercicio09_medium();
	
	@Test
	public void testeMeses() {
	ex9.exibirVetor(ex8.criaVetorMesesDoAno());
	}
	
}
