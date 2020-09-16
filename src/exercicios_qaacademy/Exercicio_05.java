package exercicios_qaacademy;

import javax.swing.JOptionPane;

public class Exercicio_05 {

	public static void main(String[] args) {
		int numeroInteiro1 = 3;
		int numeroInteiro2 = 3;
		int numeroInteiro3 = 5;
		
		somaNumeros(numeroInteiro1, numeroInteiro2, numeroInteiro3);
		subtraiNumero(numeroInteiro1, numeroInteiro2, numeroInteiro3);
		multiplicaNumero(numeroInteiro1, numeroInteiro2, numeroInteiro3);
		calculaMediaNUmeros(numeroInteiro1, numeroInteiro2, numeroInteiro3);
	
	}

	public static void calculaMediaNUmeros(int numeroInteiro1, int numeroInteiro2, int numeroInteiro3) {
		System.out.println("A media dos numeros digitados é: " 
				+ (numeroInteiro1 + numeroInteiro2 + numeroInteiro3)/3);
	}
	
	public static int calculaMediaNUmeros(int numeroInteiro1, int numeroInteiro2) {
		return (numeroInteiro1 + numeroInteiro2)/2;
		
	}

	private static void multiplicaNumero(int numeroInteiro1, int numeroInteiro2, int numeroInteiro3) {
		System.out.println("A multiplicação dos numeros digitados é: " 
				+ (numeroInteiro1 * numeroInteiro2 * numeroInteiro3));
	}

	private static void subtraiNumero(int numeroInteiro1, int numeroInteiro2, int numeroInteiro3) {
		System.out.println("A subtração dos numeros digitados é: " 
		+ (numeroInteiro1 - numeroInteiro2 - numeroInteiro3));
	}
	
	public static void somaNumeros(int numero1, int numero2, int numero3) {
			int resultado =numero1+numero2+numero3;
			System.out.println("A soma dos numeros digitados é: " 
					+ resultado);
	}

}
