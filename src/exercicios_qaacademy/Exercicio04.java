package exercicios_qaacademy;
import javax.swing.JOptionPane;

//4-)  Fa�a um algoritmo para ler um n�mero inteiro, 
//armazenar em uma vari�vel, 
//calcular o dobro, e exibir.
public class Exercicio04 {//Inicio da classe Exercicio04
	
	public static void main(String[] args) {//Inicio metodo main(principal)
		  int numeroInteiro;
		  numeroInteiro  = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));//Convers�o de uma String retornada
		  //do metodo: showInputDialog("Mensagem"), para o Tipo Inteiro, usando o m�todo parseInt("String") da classe Integer
		  numeroInteiro  = numeroInteiro  * 2; //Calculo para descobrir o dobro do numero digitado
		  System.out.println("O Dobro do numero digitado �: "+numeroInteiro); //Exibi��o do numero digitado no console
	}
}//Fim da classe Exercicio04
