package exercicios_qaacademy;

import javax.swing.JOptionPane;

public class Exercicio05 {

//	5-) Faça um algoritmo para ler três números inteiros, armazenar em variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números digitados. 
	public static void main(String[] args) {
		int numeroDigitado1, numeroDigitado2, numeroDigitado3, resultado;

		numeroDigitado1 = lerNumeroInteiro("Digite o primeiro numero inteiro");
		numeroDigitado2 = lerNumeroInteiro("Digite o segundo numero inteiro");
		numeroDigitado3 = lerNumeroInteiro("Digite o terceiro numero inteiro");

		resultado = soma(numeroDigitado1, numeroDigitado2, numeroDigitado3);
		System.out.println("A Soma dos Numeros digitados é: " + resultado);

		resultado = subtracao(numeroDigitado1, numeroDigitado2, numeroDigitado3);
		System.out.println("A Subtração dos Numeros digitados é: " + resultado);

		resultado = multiplicacao(numeroDigitado1, numeroDigitado2, numeroDigitado3);
		System.out.println("A Multiplicação dos Numeros digitados é: " + resultado);

		resultado = calcularMedia(numeroDigitado1, numeroDigitado2, numeroDigitado3);
		System.out.println("A Média dos Numeros digitados é: " + resultado);

	}

	public static int calcularMedia(int numeroDigitado1, int numeroDigitado2, int numeroDigitado3) {
		return numeroDigitado1 + numeroDigitado2 + numeroDigitado3 / 3;
	}

	private static int multiplicacao(int numeroDigitado1, int numeroDigitado2, int numeroDigitado3) {
		return numeroDigitado1 * numeroDigitado2 * numeroDigitado3;
	}

	private static int subtracao(int numeroDigitado1, int numeroDigitado2, int numeroDigitado3) {
		return numeroDigitado1 - numeroDigitado2 - numeroDigitado3;
	}

	private static int soma(int numeroDigitado1, int numeroDigitado2, int numeroDigitado3) {
		return numeroDigitado1 + numeroDigitado2 + numeroDigitado3;
	}

	public static int lerNumeroInteiro(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg + "Por favor"));
	}

}
