package exercicios_qaacademy;

import javax.swing.JOptionPane;

public class Exercicio11 {


	/**
	 * Recebe um numero inteiro e retorna a soma deste numero mais 2 . Ex. numero + 2 
	 * @param numero 
	 * @return resultado
	 */
	public int somaDois(int numero) {
		int resultado = numero;
		int i = 1;
		while (i <= 3) {// Inicio while
			resultado = resultado + 2;
			i++;
		} // Fim while
		return resultado;

	}
}
