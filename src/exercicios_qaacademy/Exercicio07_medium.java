package exercicios_qaacademy;

public class Exercicio07_medium {

	public int calculaFatorial(int numDigitado) {

		int i = numDigitado;
		int resultado = numDigitado;

		while (i > 1) {
			resultado = resultado * (i - 1); // Fatorial Numero = Numero * Numero-1
			i--;
		}
		System.out.println("O Fatorial do numero: " + numDigitado + " É igual a :" + resultado);
		return resultado;

	}

}
