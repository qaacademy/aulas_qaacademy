package exercicios_qaacademy;

import javax.swing.JOptionPane;

public class Exercicio03_hard {

	public static void main(String[] args) {
		String[][] matrizAlunos = criaMatriz();
		populaMatriz(matrizAlunos);
		exibeMatriz(matrizAlunos);
	}

	private static void exibeMatriz(String[][] matrizAlunos) {
		for (int linha = 0; linha < matrizAlunos.length; linha++) {
			for (int coluna = 0; coluna < matrizAlunos.length; coluna++) {
				System.out.println(matrizAlunos[linha][coluna]);
			}
			
		}
	}

	private static void populaMatriz(String[][] matrizAlunos) {
		for (int i = 0; i < matrizAlunos.length; i++) {
			for (int j = 0; j < matrizAlunos.length; j++) {
				matrizAlunos[i][j] = JOptionPane.showInputDialog(
						"Digite o Nome e depois a Matricula Do aluno");
			}
		}
	}

	private static String[][] criaMatriz() {
		String[][] matrizAlunos = new String[2][2];
		return matrizAlunos;
	}
}
