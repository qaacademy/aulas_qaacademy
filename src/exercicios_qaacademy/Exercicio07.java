package exercicios_qaacademy;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio07 {
	NumberFormat formatter = new DecimalFormat("########.##");
    double d = 4.0;
	
	public static double salario = 0.0;
	
	public String calculaSalario(Double salario) {
		Double inss = 0.0;
		if(salario<=1045.00) {
			 inss = salario *0.075;
			System.out.println("A Aliquta do INSS a ser paga é de : "+inss);
			
		}
		if(salario>1045.00 && salario <=2089.60) {
			 inss = salario *0.09;
			System.out.println("A Aliquta do INSS a ser paga é de : "+inss);
			
		}
		if(salario>2089.60 && salario <=3144.40) {
			 inss = salario *0.12;
			System.out.println("A Aliquta do INSS a ser paga é de : "+inss);
			
		}
		if(salario>3134.41) {
			inss = salario *0.14;
			System.out.println("A Aliquta do INSS a ser paga é de : "+inss);
			
		}
		return formatter.format(inss);
	
	



	}
	
}
