import javax.swing.JOptionPane;

//3-) Faça um algoritmo para ler dois valores,
//armazenar em variáveis, e exibir
//os valores das variáveis, trocados.
public class Exercicio03 {

	public static void main(String[] args) {// metodo main. Para executar nossos programas. 

		String valorDigitado1, valorDigitado2; //Variaveis do tipo Texto
		valorDigitado1 = JOptionPane.showInputDialog("Digite algo:");//Lendo o que foi digitado pelo usuário e armazenando na variavel. 
		valorDigitado2 = JOptionPane.showInputDialog("Digite algo:");//Lendo o que foi digitado pelo usuário e armazenando na variavel.
		System.out.println("A primeira palavra digitada é: " + valorDigitado2);// Exibe mensagens de texto e/ou valores de variáveis. 
		System.out.println("A segunda palavra digitada é: " + valorDigitado1); // Exibe mensagens de texto e/ou valores de variáveis. 
	}

}
