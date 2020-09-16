package exercicios_qaacademy;

import utils.Utilidades;

public class Exercicio06_medium_refatorado {

	public void encontraMaior(int[] numeros) {
		int maior = 0;

		maior = numeros[0];
		for (int i = 1; i < numeros.length; i++) {

			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}

		System.out.println("O numero Maior é: " + maior);
	}

	public void encontraNumerosIguais(int[] numeros) {
		int[] numerosIguais = new int[numeros.length];
		int igual = 0;
		boolean temIgual = false;
		for (int i = 0; i < numeros.length - 1; i++) {
			igual = numeros[i];
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] == igual) {
					temIgual = true;
					igual = numeros[j];
					numerosIguais[i] = igual;
				}
			}
		}

		if (temIgual) {
			System.out.println("Temos Numeros Iguais");
			Utilidades.exibirVetor(numerosIguais);
		} else {
			System.out.println("Não tem numeros Iguais");
		}

	}

}
