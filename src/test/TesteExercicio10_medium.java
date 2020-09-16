package test;

import org.junit.Test;

import exercicios_qaacademy.Exercicio10_medium;

public class TesteExercicio10_medium {
	
	@Test
	public void testeCadastroAluno() {

		Exercicio10_medium ex10 = 
				new Exercicio10_medium();
		ex10.recebeNomeNumeroAlunos();
	}

}
