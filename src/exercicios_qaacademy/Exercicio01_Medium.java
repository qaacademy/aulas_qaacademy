package exercicios_qaacademy;

public class Exercicio01_Medium {

	public void parImpar() {
		
		int i = 1;

		while (i <= 100) {// Inicio while

			if (i % 2 == 0) {
				System.out.println("O número: " + i + " é par");
			} else {
				System.out.println("O número: " + i + " é ímpar");
			}
			i++;

		} // fim while
	}

}
