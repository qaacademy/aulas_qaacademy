package exercicios_qaacademy;

import java.util.Arrays;
import java.util.Random;

public class Exercicio01_hard {
	
	public static void main(String[] args) {
		
		int[] vetnum = new int[100]; //Cria Vetor
		Random numeroRamdomico = new Random();//Cria objeto Random
		for (int i = 0; i < vetnum.length; i++) { //For para popular o vetor
			vetnum[i] = numeroRamdomico.nextInt(100);  //Atribui para a posição i, um numero Randomico de 0 a 100. 
			System.out.println(vetnum[i]); //Imprime Vetor
		}
		Arrays.sort(vetnum);//Ordena Vetor
		for (int i = 0; i < vetnum.length; i++) {
			System.out.println(vetnum[i]); //Imprime vetor ordenado posição i
		}
		System.out.println("O Menor numero é: "+vetnum[0]); //Exibe o menor do Vetor
		
	}

}
