package outrosExercicios_qaacademy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class BuscaNumeroVetor {
	static Random random = new Random();
	static boolean achou = false;
	static Integer[] vetorNumeros;

	public static void main(String[] args) {

		buscaListaOrdenada(ordenaVetorList(criaVetor(100)));

	}

	private static void buscaListaOrdenada(List listaOrdenada) {
		int num =recebeInteiro();		
		if(listaOrdenada.contains(num)) {
			System.out.println("Numero encontrado! Posição: "+listaOrdenada.indexOf(num));
		}else {
			System.out.println("Numero N�o encontrado!");

		}
		

	}

	private static void recebeNumero(int[] vetorNumeros) {
		if (!buscaNumero(vetorNumeros, recebeInteiro())) {
			System.out.println("N�mero buscado n�o se encontra no vetor! Tente de novo");
		}
	}

	private static Boolean buscaNumero(int[] vetorNumeros, int numBuscado) {
		for (int i = 0; i < vetorNumeros.length && !achou; i++) {
			if (vetorNumeros[i] == numBuscado) {
				achou = true;
				System.out.println("N�mero buscado : " + numBuscado + " Posi��o: " + i);
			}
		}
		return achou;
	}

	private static Integer[] criaVetor(int tamanhoVetor) {
		Integer vetorNumeros[] = new Integer[tamanhoVetor];
		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = random.nextInt(100);
			// System.out.println("Posi��o: " + i + " - Valor: " + vetorNumeros[i]);
		}
		return vetorNumeros;
	}

	static void ordenaCrescente(Integer[] vetorNumeros2) {
		int j;
		int key;
		int i;

		for (j = 1; j < vetorNumeros2.length; j++) {
			key = vetorNumeros2[j];
			for (i = j - 1; (i >= 0) && (vetorNumeros2[i] > key); i--) {
				vetorNumeros2[i + 1] = vetorNumeros2[i];
			}
			vetorNumeros2[i + 1] = key;
		}
	}

	static void imprimeVetor(Integer[] vetorNumeros2) {
		for (int i = 0; i < vetorNumeros2.length; i++) {
			System.out.println(String.valueOf(vetorNumeros2[i]));

		}
	}

	static List ordenaVetorList(Integer vet[]) {
		List listaVetor = Arrays.asList(vet);
		Collections.sort(listaVetor);
		for (int i = 0; i < listaVetor.size(); i++) {
			System.out.println(listaVetor.get(i));

		}
		return listaVetor;
	}

	public static Integer recebeInteiro() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero que deseja Buscar:"));

	}

}
