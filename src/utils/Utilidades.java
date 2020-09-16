package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utilidades {
	static DecimalFormat formatter = new DecimalFormat("########.##"); 	
	
	public static String formatarDouble(double valor) {
		return formatter.format(valor);
	}
	
	public static int converteStringParaInteiro(String numero) {
		return Integer.parseInt(numero);
	}
	
	public static double converteStringParaDouble(String numero) {
		return Double.parseDouble(numero);
	}
	
	public static void exibirVetor(String vetor []) {
		
		int i = 0;
		while (i<vetor.length) {
			System.out.println("Mês: "+vetor[i]);
			i++;	
		}
		
	}
	
	public static void exibirVetor(int vetor []) {
		
		int i = 0;
		while (i<vetor.length) {
			System.out.println(+vetor[i]);
			i++;	
		}
		
	}

}