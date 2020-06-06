package exercicios_qaacademy;

import javax.swing.JOptionPane;

public class Util {
	
	public int calcularMedia(int numeroDigitado1, int numeroDigitado2) {
		return (numeroDigitado1 + numeroDigitado2) / 2;
	}

	public int multiplicacao(int numeroDigitado1, int numeroDigitado2, int numeroDigitado3) {
		return numeroDigitado1 * numeroDigitado2 * numeroDigitado3;
	}

	public int subtracao(int numeroDigitado1, int numeroDigitado2, int numeroDigitado3) {
		return numeroDigitado1 - numeroDigitado2 - numeroDigitado3;
	}

	public int soma(int numeroDigitado1, int numeroDigitado2, int numeroDigitado3) {
		return numeroDigitado1 + numeroDigitado2 + numeroDigitado3;
	}

	public int lerNumeroInteiro(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public double lerNumeroReal(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
}
