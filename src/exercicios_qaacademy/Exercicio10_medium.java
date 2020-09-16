package exercicios_qaacademy;

import javax.swing.JOptionPane;

import utils.Utilidades;

public class Exercicio10_medium {
	
	public void recebeNomeNumeroAlunos() {
	
		String nomeAlunos[] = new String [5]; 
		int numeroAluno[]= new int [5]; 
		int i = 0;
		
		while (i<5) {
		nomeAlunos[i] = JOptionPane.showInputDialog(
				"Digite o nome do Aluno:");
		numeroAluno [i] = Utilidades.converteStringParaInteiro(
				JOptionPane.showInputDialog(
						"Digite o Número do Aluno:"));
		
		System.out.println("Aluno: "+nomeAlunos[i]);
		System.out.println("Numero: "+numeroAluno[i]);

		i++;
		}
				
	}

}

