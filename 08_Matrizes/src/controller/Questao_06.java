package controller;

import util.Teclado;

public class Questao_06 {
	
	/*
	 * Desenvolver um programa que crie uma matriz com 3 linhas e 5 colunas. 
	 * 
	 * As 4 primeiras colunas de todas as linhas deverão ser preenchidas com números informados pelo usuário. 
	 * 
	 * A 5ª coluna deverá receber a média dos 4 valores existentes na mesma linha (das 4 primeiras colunas).
	 * 
	 * Ao final exiba toda a matriz.
	 */

	public static void main(String[] args) {
		int a[][]=new int[3][5];
		int acum=0;
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				a[i][j]=Teclado.lerInt("Digite um número para alocar à posição " + (i+1) + "." + (j+1));
				
			}
		}
		
		
		for (int i=0;i<3;i++) {
			
			for (int j=0;j<5;j++) {
				a[i][4]=acum/4;
				acum=acum+a[i][j];
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			acum=0;
		}
		

	}

}
