package outrosExercicios_qaacademy;


import javax.swing.JOptionPane;

public class ExercicioPalavraInvertida {

	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Escreva uma palavra: ");
		StringBuffer stringBuff = new StringBuffer(entrada);
		System.out.println(stringBuff.reverse());
	}

}
