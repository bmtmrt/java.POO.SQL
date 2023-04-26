package controller;

import util.Teclado;

public class Questao_03 {

	/*
	 * Desenvolver um programa que crie uma matriz de 4 linhas e 3 colunas. Pergunte
	 * ao usuário números para preencher toda a matriz, e ao final, exiba a matriz
	 * inteira e a soma dos números pares contidos na matriz
	 */

	public static void main(String[] args) {
		int a[][]=new int[4][3];
		int sum=0;
		
		for (int i=0;i<4;i++) {
			for (int j=0;j<3;j++) {
				a[i][j]=Teclado.lerInt("Digite um número à posição " + (i+1) + "|" + (j+1));
				sum+=a[i][j];
			}
		}
		for (int i=0;i<4;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(" | " + a[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("-------SOMA-------");
		System.out.println(sum);

	}

}
