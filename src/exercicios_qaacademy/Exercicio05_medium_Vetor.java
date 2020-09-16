package exercicios_qaacademy;

import javax.swing.JOptionPane;

public class Exercicio05_medium_Vetor {

	public void verificaMenorDigitado() {

		int i = 0;
		int menor = 0;
		int[] numeroDigitado = { 5, 4, 3, 1, 8};

		while (i < 5) {

			if (numeroDigitado[i] <= menor || i == 0) {
				menor = numeroDigitado[i];
			}
			System.out.println("Numero digitado: " + numeroDigitado[i]);
			i++;
		}
		System.out.println("Menor número: " + menor);
	}

}
