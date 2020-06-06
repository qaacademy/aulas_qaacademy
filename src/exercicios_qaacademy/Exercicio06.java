package exercicios_qaacademy;

import javax.swing.JOptionPane;

public class Exercicio06 {
	/*
	 * 6-) Faça um algoritmo para ler duas notas, calcular a média. E SE - a média >
	 * 5 Exibir aprovado; SE a média < que 5 exibir reprovado; Se media = 5 exibir
	 * exame.
	 * 
	 */

	public void statusAprovacaoAluno() {

		Util util = new Util();

		int nota1 = util.lerNumeroInteiro("Digite a primeira nota");
		int nota2 = util.lerNumeroInteiro("Digite a segunda nota");

		if (util.calcularMedia(nota1, nota2) > 5){//Teste 6 e 10
			System.out.println("Aprovado"); 
		}else if (util.calcularMedia(nota1, nota2) == 5) { // 5
			System.out.println("Exame");
		} else {
			System.out.println("Reprovado"); //4 e 0
		}
	}
}
