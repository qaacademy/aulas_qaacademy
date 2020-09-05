package exercicios_qaacademy;

import javax.swing.JOptionPane;

public class Exercicio02_Medium {
	
	public double calculaInvestimentoJurosCompostos(double valorInvestido, double taxaJuros, int tempoInvestido) {
		double resultado = valorInvestido; 
		int ano = 1;
		
		while (ano<=tempoInvestido) {
		resultado = resultado+( resultado*taxaJuros);
		ano++;
		}
		
		System.out.println("Valor investido: "+ valorInvestido);
		System.out.println("Valor juros: "+ (resultado - valorInvestido));
		System.out.println("Valor total: "+resultado);
		
		return resultado;
	}

}
