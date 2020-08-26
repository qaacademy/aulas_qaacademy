package outrosExercicios_qaacademy;
import javax.swing.JOptionPane;

public class ExercicioFibonacci {

	public static void main(String[] args) {
		int elemento = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de elementos da sequencia de Fibonacci: "));

		Integer vetorTermos[] = new Integer[elemento];
		vetorTermos[0] = 0;
		vetorTermos[1] = 1;

		for (int i = 2; i < vetorTermos.length; i++) {	
			
			vetorTermos[i]=vetorTermos[i-1]+vetorTermos[i-2];
		}
		
		imprime(vetorTermos);

	}

	private static void imprime(Integer[] vetorTermos) {
		for (int i = 0; i < vetorTermos.length; i++) {
			System.out.println(vetorTermos[i].toString());
		}
	}

}
