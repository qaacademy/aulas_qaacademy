package exercicios_qaacademy;

import javax.swing.JOptionPane;

public class Exercicio11_medium {

	public int calculaFibonacci(int termo) {

		int i = 2;
		int numDigitado = termo;
		int[] vetFibonacci = new int[numDigitado];
		vetFibonacci[0] = 0;
		vetFibonacci[1] = 1;
		while (i < numDigitado) {
			vetFibonacci[i] = vetFibonacci[i - 1] + vetFibonacci[i - 2];
			i++;
		}
		return vetFibonacci[numDigitado-1];

	}

}
