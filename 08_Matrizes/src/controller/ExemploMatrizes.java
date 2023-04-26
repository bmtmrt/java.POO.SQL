package controller;

import util.Teclado;

public class ExemploMatrizes {
	/*
	 * fazer matriz com 3 linhas e 4 colunas com valores inseridos pelo usuário. ao final exibir todos os valores inseridos na matriz.
	 */

	public static void main(String[] args) {
		//matriz[linha][coluna];
		int mat[][]=new int[3][4];
		//precisa de duas variáveis contadoras diferentes. var i e var j, var line e var column
		for (int i=0; i<3;i++) { //for baseado nas linhas da matriz
			for (int j=0;j<4;j++) { //for de colunas da matriz
				mat[i][j]=Teclado.lerInt("Informe o número para salvar em mat [" + i + "][" + j + "]");
			}
		}
		
		
		for (int i=0; i<3;i++) { //for baseado nas linhas da matriz
			for (int j=0;j<4;j++) { //for de colunas da matriz
				System.out.print(mat[i][j] + " ");
			}
			//se quisermos que a disposição da resposta seja em matriz, precisamos comandar:
			System.out.println();//esse sysout só serve para pular linha.
		}
		
	}
}
