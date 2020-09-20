package exercicios_qaacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio02_hard {

	public static void main(String[] args) {
		
		List<Integer> listNum = new ArrayList<>(); //Cria uma lista
		
		listNum = criaListaComCemNumerosRandomicos(listNum);
		exibirLista(listNum);
		ordenaLista(listNum);
		exibirLista(listNum);
		inverteOrdenacao(listNum);
		exibeMaior(listNum);
		exibeMenor(listNum);
		
	}

	private static void exibeMenor(List<Integer> listNum) {
		System.out.println("-----------------------------");
		System.out.println("O Maior numero é: "+listNum.get(0));
	}

	private static void exibeMaior(List<Integer> listNum) {
		System.out.println("-----------------------------");
		System.out.println("O Menor numero é: "+listNum.get(99));
	}

	private static void exibirLista(List<Integer> listNum) {
		System.out.println("-----------------------------");
		for(int numero : listNum) {
			
			System.out.println(numero);
		}
	}

	private static void inverteOrdenacao(List<Integer> listNum) {
		Collections.reverse(listNum);
	}

	private static void ordenaLista(List<Integer> list) {
		Collections.sort(list);
	}

	private static List<Integer> criaListaComCemNumerosRandomicos(List<Integer> listNum) {
		Random numeroRamdomico = new Random();//Cria Objeto Randomico
		for (int i = 0; i < 100; i++) {
			listNum.add(numeroRamdomico.nextInt(100)); //Adiciona Numero Randomico na Lista
		}
		return listNum;
	}
		

	}



/*
 * 2-)Faça um algoritmo que leia 100 números inteiros,
 *  armazene em um vetor,
 *   ordene em ordem decrescente e exiba o maior
 *    e o menor número dos 100.
*/