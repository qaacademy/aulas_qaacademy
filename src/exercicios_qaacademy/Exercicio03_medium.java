package exercicios_qaacademy;

public class Exercicio03_medium {

	public void somaAteMil() {
		int i = 0, soma = 0;

		while (i < 1000) {
			soma = soma + i;
			if (soma >= 1500) {
				break; // break
			} else {
				i++; // i=i+1 ou i+=1;
			}
		}
		
		System.out.println("O Total somado foi: "+soma);

	}

}


