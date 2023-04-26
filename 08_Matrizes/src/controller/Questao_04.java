package controller;

import util.Teclado;

public class Questao_04 {
	/*
	 * Desenvolver um programa que crie uma matriz de 5 linhas e 2 colunas. Pergunte
	 * ao usuário números para preencher toda a matriz, e ao final, exiba a matriz
	 * inteira e a média dos números da matriz.
	 */

	public static void main(String[] args) {
		double a[][] = new double[5][2]; //aqui criamos a matriz
		double acum=0, media;
		
		for (int i=0;i<5;i++) { //agora estamos declarando o primeiro loop
			for (int j=0;j<2;j++) { //esse loop interno é para fazermos o cálculo
				a[i][j]=Teclado.lerDouble("Digite o número referente a [" + i + "][" + j + "]");
				acum+=a[i][j];				
			}
		}
		media=acum/(10);
		for (int i=0;i<5;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(a[i][j] + " ");			
			}
			System.out.println();
		}
		System.out.println("A soma dos números da matriz é " + acum + " e a média é " + media);
	}

}
