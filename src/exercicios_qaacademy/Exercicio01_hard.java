package exercicios_qaacademy;

import java.util.Arrays;
import java.util.Random;

public class Exercicio01_hard {

	public static void main(String[] args) {
		int[] vetnum = new int[100];
		Random gerador = new Random();
		for (int i = 0; i < vetnum.length; i++) {
			vetnum[i] = gerador.nextInt(100);
		}
		Arrays.sort(vetnum);
	

		System.out.println("Números ordenados:");
		for (int numero : vetnum) {
			System.out.println(numero);
		}

		System.out.println("O Menor número é: " + vetnum[0]);

	}

}
