package controller;

public class Questao_07 {
	/*
	 * Desenvolva um programa que gere e exiba a matriz abaixo: 
	 * 11 12 13 14 
	 * 15 16 17 18 
	 * 19 20 21 22
	 */

	public static void main(String[] args) {
		int a[][]=new int [3][4];
		int cont=11;
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				a[i][j]=cont;
				cont++;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}			
	}

}
