package exercicios_qaacademy;

public class Exercicio6_Medium {

	public static void main(String[] args) {

		int[] numeros = { 99, 2, 4, 299, 5, 0 };

		int maior = 0;
		int igual = 0;
		boolean temIgual = false;
		
		igual = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			igual = numeros[i];
			for (int j = i+1; j < numeros.length; j++) {
				if (numeros[j] == igual) {
					temIgual = true;
				}
	
			}
			
		}
			
		maior = numeros[0];
			for (int j = 1; j < numeros.length; j++) {

				if (numeros[j] > maior) {
					maior = numeros[j];
				}
	
			}

	

		System.out.println("o Numero : " + maior + " É o maior");

		if (temIgual) {
			System.out.println("Tem números iguais!");
		}else {
			System.out.println("Não tem números iguais");
		}

	}

}
