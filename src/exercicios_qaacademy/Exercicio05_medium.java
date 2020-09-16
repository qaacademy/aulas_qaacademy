package exercicios_qaacademy;

import javax.swing.JOptionPane;

public class Exercicio05_medium {

	public void verificaMenorDigitado() {

		int i = 1;
		int menor = 0, numeroDigitado;

		while (i <= 5) {
			numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro, maior que Zero"));
			if (numeroDigitado <= menor || i == 1) {
				menor = numeroDigitado;
			}
			i++;
			System.out.println("Numero digitado: " + numeroDigitado);
		}
		System.out.println("Menor número: " + menor);
	}

}
