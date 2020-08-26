package outrosExercicios_qaacademy;

import java.util.Random;// importando a classe Random para que possa ultilizar os metodos dela.

public class ExercicioMatriz {

	public static void main(String[] args) {
		int[][] num = new int[3][3];
		Random aleatorio = new Random();

		for (int i = 0; i < 3; i++) {// percorrendo a linha
			for (int j = 0; j < 3; j++) {// percorrendo a coluna
				num[i][j] = aleatorio.nextInt(20);// gerando os numeros randomicos
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num[i][j] + " | ");// utiliza a mesma repetição para imprimir os valores
			}
			System.out.println("\n");// para quebras a linha e ficar com formato de matriz
		}

	}
}
