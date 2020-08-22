package exercicios_qaacademy;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Exercicio08 {
	public static Double salario = 0.0;
	public static Double valorImposto;
	//NumberFormat formatter = new DecimalFormat("########.##");

	public static void main(String[] args) {
		salario = Double.valueOf(JOptionPane.showInputDialog("Digite o salário: "));
		

		if (salario >= 1903.99 && salario <= 2826.65) {
			valorImposto = (salario * 0.075) - 142.80;
			System.out.println("O Valor da aliquota de IRPF do salario a ser paga é de : " + salario);

		}

		if (salario >= 2826.66 && salario <= 3751.05) {
			valorImposto = (salario * 0.15) - 354.80;
			System.out.println("O Valor da aliquota de IRPF do salario a ser paga é de : " + salario);

		}

		if (salario >= 3751.06 && salario <= 4664.68) {
			valorImposto = (salario * 0.225) - 636.13;
			System.out.println("O Valor da aliquota de IRPF do salario a ser paga é de : " + salario);

		}

		if (salario > 4664.68) {
			valorImposto = (salario * 0.275) - 869.36;
			System.out.println("O Valor da aliquota de IRPF do salario a ser paga é de : " + salario);

		}

		if (salario >= 1903.99 && salario <= 2826.65) {
			valorImposto = salario * 0.075;
			System.out.println("O Valor da aliquota de IRPF do salario a ser paga é de : " + salario);

		}

		else {
			System.out.println("Exibir Isento de imposto de renda.");
		}

		System.out.println("Seu salário bruto é :" + salario + "\nO valor do imposto é: " + valorImposto
				+ "\nSeu salário líquido é: " + (salario - valorImposto));
	}

	public static void calculaIrpfSalario(Double salario) {

		if (salario >= 1903.99 && salario <= 2826.65) {
			valorImposto = (salario * 0.075) - 142.80;
			System.out.println("O Valor da aliquota de IRPF do salario a ser paga é de : " + salario);

		}

		if (salario >= 2826.66 && salario <= 3751.05) {
			valorImposto = (salario * 0.15) - 354.80;
			System.out.println("O Valor da aliquota de IRPF do salario a ser paga é de : " + salario);

		}

		if (salario >= 3751.06 && salario <= 4664.68) {
			valorImposto = (salario * 0.225) - 636.13;
			System.out.println("O Valor da aliquota de IRPF do salario a ser paga é de : " + salario);

		}

		if (salario > 4664.68) {
			valorImposto = (salario * 0.275) - 869.36;
			System.out.println("O Valor da aliquota de IRPF do salario a ser paga é de : " + salario);

		}

		if (salario >= 1903.99 && salario <= 2826.65) {
			valorImposto = salario * 0.075;
			System.out.println("O Valor da aliquota de IRPF do salario a ser paga é de : " + salario);

		}

		else {
			System.out.println("Exibir Isento de imposto de renda.");
		}

		System.out.println("Seu salário bruto é :" + salario + " O valor do imposto é: " + valorImposto
				+ "Seu salário líquido é: " + (salario - valorImposto));

	}

}
