package exercicios_qaacademy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio02_hard2 {

	public static void main(String[] args) {
		Integer[] vetnum = new Integer[100];
		Random gerador = new Random();
		for (int i = 0; i < vetnum.length; i++) {
			vetnum[i] = gerador.nextInt(100);
		}

		System.out.println("Números Sem ordenar:");
		Arrays.sort(vetnum);
		for (int numero : vetnum) {
			System.out.println(numero);
		}

		List<Integer> listNum = Arrays.asList(vetnum);
		Collections.reverse(listNum);

		System.out.println("Números ordenados:");
		for (int numero : vetnum) {
			System.out.println(numero);
		}
		System.out.println("O Menor número é: " + vetnum[0]);
		System.out.println("O Menor número é: " + vetnum[99]);

	}

}
