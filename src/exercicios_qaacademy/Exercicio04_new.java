package exercicios_qaacademy;

import javax.swing.JOptionPane;

public class Exercicio04_new {

	public static void main(String[] args) {
		int valorDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
	
		System.out.println("Dobro de: " + valorDigitado + " - É Igual a: " + valorDigitado * 2);
	}
}
