package exercicios_qaacademy;

import utils.Utilidades;

public class Exercicio10 {

	/**
	 * Metodo para calcular o rendimento de um investimento consirando Juros Simples
	 * @param valorInvestido
	 * @param juros
	 * @param ano
	 */
	public String calcularInvestimento(double valorInvestido, double juros, int ano) {
double jurosAcumulado = 0;
int i =1;
		while (i <= ano) {
			jurosAcumulado = (valorInvestido * juros) + jurosAcumulado;
			i++;
		}
		System.out.println("Valor investido é de :" + valorInvestido);
		System.out.println("Valor investido é de :" + jurosAcumulado);
		System.out.println("Valor investido é de :" + (jurosAcumulado + valorInvestido));
		return Utilidades.formatarDouble(jurosAcumulado);
	}
	
	
	
	
	
	
	
	
	

}
