package exercicios_qaacademy;

public class Exercicio04_medium {
	public void multiplicaAteMil() {

		int i = 1;
		int multiplicacao = 1;

		while (i <= 1000) {
			multiplicacao = multiplicacao * i;
			if (multiplicacao >= 1000) {
				multiplicacao = 1;
			}
			i++; // i=i+1
			System.out.println("Valor Multiplicação: " + multiplicacao);

		}

		System.out.println("Resultado das multiplicações" + multiplicacao);

	}

}
