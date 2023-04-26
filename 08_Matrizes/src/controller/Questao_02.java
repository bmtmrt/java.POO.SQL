package controller;

import util.Teclado;

public class Questao_02 {
	/*
	 * Desenvolver um programa que crie uma matriz com 3 linhas e 2 colunas.
	 * Pergunte ao usuário números para preencher toda a matriz, e ao final exiba a
	 * matriz inteira e também a soma dos números desta matriz.
	 */

	public static void main(String[] args) {
		int a[][]=new int[3][2];
		int acum=0;
		
		
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				a[i][j]=Teclado.lerInt("Insira o número referente a [" + i + "][" + j +"]");
				acum+=a[i][j];
				
			}
		}
		for (int i=0;i<3;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------- \n" + "a soma de todos os valores dessa matriz é " + acum);
	}

}
