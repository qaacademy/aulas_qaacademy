package exercicios_qaacademy;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

import utils.Utilidades;

/**
 * 
 */

/**
 * Inicio do Algoritmo Declarar variável do tipo Numerico: salario, alíquota;
 * salario = Ler digitado(1.000,00); SE(salario <= 800,00) alíquota=salario * 5%
 * ; //0,05 – Linguagem. SE(salario > 800,00 && salario <=1039,00)
 * alíquota=salario * 11% ; //0,11 – Linguagem SE (salario >1039,00)
 * alíquota=salario * 20% ; //0,20 – Linguagem Exibir alíquota; Fim Algoritmo
 * 
 * @author mac
 * 
 *
 */
public class Exercicio07 {
	
	public Exercicio07() {
		System.out.println("Construindo Exercicio 07");
	}


	public static double calculaInss(double salario) {
		
		double valorInss;
		if (salario <= 1045.00) {
			valorInss = salario * 0.075;
		} else if (salario > 1045.00 && salario <= 2089.60) {
			valorInss = salario * 0.09;
		} else if (salario > 2089.60 && salario <= 3134.40 ) {
			valorInss = salario * 0.12;
		}else if (salario > 3134.40 && salario <= 6101.06 ) {
			valorInss = salario * 0.14;
		}else {
			valorInss = 854.14;
		}
		return valorInss;
	}
	
	public static String calculaInssString(double salario) {	
		
		double valorInss;
		if (salario <= 1045.00) {
			valorInss = salario * 0.075;
		} else if (salario > 1045.00 && salario <= 2089.60) {
			valorInss = salario * 0.09;
		} else if (salario > 2089.60 && salario <= 3134.40 ) {
			valorInss = salario * 0.12;
		}else if (salario > 3134.40 && salario <= 6101.06 ) {
			valorInss = salario * 0.14;
		}else {
			valorInss = 854.14;
		}
		return Utilidades.formatarDouble(valorInss);
	}

}
