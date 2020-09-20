package exercicios_qaacademy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio02_hard_Lista {

	public static void main(String[] args) {
		Integer[] vetnum = criaVetorComNumerosRandomicos();
		ordenaVetor(vetnum);
		exibirVetor(vetnum);
		List<Integer> listNum = converteVetorParaLista(vetnum);
		inverteOrdenacao(listNum);
		System.out.println("O Menor numero é: "+listNum.get(99));
		System.out.println("O Maior numero é: "+listNum.get(0));
		exibirLista(listNum);
		
	}

	private static void exibirLista(List<Integer> listNum) {
		for(int numero : listNum) {
			System.out.println("Valor: "+numero);
		}
	}

	private static void inverteOrdenacao(List<Integer> listNum) {
		Collections.reverse(listNum);
	}

	private static List<Integer> converteVetorParaLista(Integer[] vetnum) {
		List<Integer> listNum = Arrays.asList(vetnum);
		return listNum;
	}

	private static void exibirVetor(Integer[] vetnum) {
		for (int i = 0; i < vetnum.length; i++) {
			System.out.println(vetnum[i]);
		}
	}

	private static void ordenaVetor(Integer[] vetnum) {
		Arrays.sort(vetnum);
	}

	private static Integer[] criaVetorComNumerosRandomicos() {
		Integer[] vetnum = new Integer[100];
		Random numeroRamdomico = new Random();
		for (int i = 0; i < vetnum.length; i++) {
			vetnum[i] = numeroRamdomico.nextInt(100); 
			System.out.println(vetnum[i]);
		}
		return vetnum;
	}
		

	}



/*
 * 2-)Faça um algoritmo que leia 100 números inteiros,
 *  armazene em um vetor,
 *   ordene em ordem decrescente e exiba o maior
 *    e o menor número dos 100.
*/