package controller;

import util.Teclado;

public class Questao_09 {

	/*
	 * Desenvolver um programa que pergunte o conteúdo de uma matriz a com 3 linhas e 4 colunas.
	 * Em seguida preencha a matriz b de mesma dimensão com os valores da matriz a elevados ao quadrado. 
	 * Ao final exiba o conteúdo das duas matrizes.
	 */

	public static void main(String[] args) {
		double a[][]=new double[3][4];
		double b[][]=new double[3][4];
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				a[i][j]=Teclado.lerDouble("Coloca um número:");
			}
		}
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				b[i][j]=Math.pow(a[i][j], 2);
			}
		}

		System.out.println("#------# Matriz A #------#");
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(a[i][j] + "	|	");
			}
			System.out.println();
		}
		System.out.println("#------# Matriz B #------#");
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(b[i][j] + "	|	");
			}
			System.out.println();
		}
	}

}
