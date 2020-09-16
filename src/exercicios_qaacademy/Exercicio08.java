package exercicios_qaacademy;

import utils.Utilidades;

/**
 * Classe para fazer o calculo do imposto de renda.
 * @author Flávio Dias.
 *
 */
public class Exercicio08 {
	
	/**
	 * Metodo para calcular o salario liquido.
	 * @param salario - Salario que vai ser utilizado como base para o calculo do IR
	 * @param valorIR - Valor do Imposto de Renda calculado com base no salario
	 * @param valorInss - Valor efetivo do Inss, com base no salario
	 * @return
	 */
	public String calculaSalarioLiquido(double salario, double valorIR, double valorInss) {
		return  Utilidades.formatarDouble(salario - (valorInss+valorIR));
	}
	public double calculaIR(double salario) {
		double valorIR;
		if (salario >= 1903.99 && salario <=2826.65) {
			valorIR = (salario * 0.075)-142.70;// valor dedução 142.80
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			valorIR = (salario * 0.15)-354.80;
		} else if (salario >= 3751.06 && salario <= 4664.68 ) {
			valorIR = (salario * 0.225)-636.13;
		}else if (salario > 4664.68) {
			valorIR = (salario * 0.275)-869.36;
		}else {
			valorIR = 0.00;
		}
		return valorIR;
	}
	
	public String calculaIRString(double salario) {
		double valorIR;
		if (salario >= 1903.99 && salario <=2826.65) {
			valorIR = (salario * 0.075)-142.70;// valor dedução 142.80
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			valorIR = (salario * 0.15)-354.80;
		} else if (salario >= 3751.06 && salario <= 4664.68 ) {
			valorIR = (salario * 0.225)-636.13;
		}else if (salario > 4664.68) {
			valorIR = (salario * 0.275)-869.36;
		}else {
			valorIR = 0.00;
		}
		return Utilidades.formatarDouble(valorIR);
	}
	

}
