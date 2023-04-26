package controller;

import util.Teclado;

public class Questao_06 {

	/*
	 * Desenvolver um programa que pergunte 20 elementos de um vetor a e construa um
	 * vetor b de mesma dimensão com os mesmos elementos de a, os quais devem estar
	 * invertidos, ou seja, o primeiro elemento de a passa a ser o último elemento
	 * de b, e assim por diante. Apresentar os vetores a e b.
	 */

	public static void main(String[] args) {
		int a[]=new int[20];
		int b[]=new int[20];
		
		
		for (int i=0;i<20;i++) {
			a[i]=Teclado.lerInt("Digita:");
		}
		for (int i=19;i>=0;i=i-1) {
			b[i]=a[i];			
		}
		
		
		
		
		for (int i=0;i<20;i++) {
			System.out.print(a[i] + " | ");
			}
		
		System.out.println("\n");
		System.out.println("Vetor B:");
		
		
		for (int i=19;i>=0;i=i-1) {
			System.out.print(b[i] + " | ");
			}

	}

}
