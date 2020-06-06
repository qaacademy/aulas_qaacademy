package exercicios_qaacademy;
import javax.swing.JOptionPane;

//3-) Fa�a um algoritmo para ler dois valores,
//armazenar em vari�veis, e exibir
//os valores das vari�veis, trocados.
public class Exercicio03 {

	public static void main(String[] args) {// metodo main. Para executar nossos programas. 

		String valorDigitado1, valorDigitado2; //Variaveis do tipo Texto
		valorDigitado1 = JOptionPane.showInputDialog("Digite algo:");//Lendo o que foi digitado pelo usu�rio e armazenando na variavel. 
		valorDigitado2 = JOptionPane.showInputDialog("Digite algo:");//Lendo o que foi digitado pelo usu�rio e armazenando na variavel.
		System.out.println("A primeira palavra digitada �: " + valorDigitado2);// Exibe mensagens de texto e/ou valores de vari�veis. 
		System.out.println("A segunda palavra digitada �: " + valorDigitado1); // Exibe mensagens de texto e/ou valores de vari�veis. 
	}

}
