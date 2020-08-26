package outrosExercicios_qaacademy;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ExercicioCalcFatorial {

	public static void main(String[] args) {
		int fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero; "));
		System.out.println(fatorialRecursivo(fatorial));
		
	}
	
	public static int fatorialRecursivo(int fat) {
		if (fat == 0)
			return 1;
		return fat * fatorial(fat - 1);
	}

	private static int fatorial(int fat) { // calculando o fatorial
		for (int i = fat - 1; i != 1; i--) {
			fat *= i;
		}
		return fat;

	}

	

	private static BigDecimal fatorial(BigDecimal fat) {
		for (int i = fat.subtract(new BigDecimal(1)).intValue(); i >= 1; i--) {
			fat = fat.multiply(new BigDecimal(i));
		}
		return fat;

	}

}