package controller;

import util.Teclado;

public class Questao_01 {
	/*
	 * Desenvolver um programa que crie uma matriz com 5 linhas e 3 colunas.
	 * Pergunte ao usuário o conteúdo desta matriz e ao final exiba a matriz
	 * inteira.
	 */

	public static void main(String[] args) {
		int a[][]=new int[5][3];
		
		for (int i=0;i<5;i++) {
			for (int j=0; j<3;j++) {
				a[i][j]=Teclado.lerInt("Qual número você quer adicionar?");
			}
		}
		
		for (int i=0;i<5;i++) {
			for (int j=0; j<3;j++) {
				System.out.print(" | " + a[i][j] + " | ");
			}
			System.out.println();
		}
		
		
	}

}
