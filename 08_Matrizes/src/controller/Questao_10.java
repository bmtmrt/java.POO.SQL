package controller;

import util.Teclado;

public class Questao_10 {

	/*
	 * Desenvolver um programa que crie uma matriz a com 3 linhas e 5 colunas e um vetor b com 5 itens. 
	 * 
	 * Perguntes ao usuário os números para preencher a matriz.
	 * 
	 * O programa deverá somar todos os itens de uma mesma coluna da matriz e guardar o 
	 * resultado na posição correspondente a esta coluna no vetor.
	 * 
	 *Ao final o programa deverá exibir a matriz e o vetor.
	 */

	public static void main(String[] args) {
		int a [][]=new int[3][5];
		int b[]=new int[5];
		int acum=0;
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<5;j++) {
				a[i][j]=Teclado.lerInt("Digite um número para atribuir à posição " + (i+1) + "." + (j+1) + ":");
				acum=+a[i][j];
				b[j]+=acum;
			}
		}
		System.out.println("Matriz A:");
		for (int i=0;i<3;i++) {
			for (int j=0;j<5;j++) {
				System.out.print("	|	" + a[i][j] + "	|	");
			}
			System.out.println();
		}
		
		System.out.println("Vetor b");
		for (int j=0;j<5;j++) {
			System.out.print("	|	" + b[j] + "	|	");
		}

	}

}
