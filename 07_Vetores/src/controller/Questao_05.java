package controller;

import util.Teclado;

public class Questao_05 {

	/*
	 * Desenvolver um programa que pergunte 5 valores do vetor a, e em seguida crie
	 * um vetor b de mesma dimensão contendo os valores ao quadrado correspondentes
	 * no vetor a. Ao final exibir os 2 vetores.
	 */

	public static void main(String[] args) {
		double a[]=new double [5];
		double b[]=new double [5];
		
		for (int i=0;i<5;i++) {
			a[i]=Teclado.lerInt("Digite para atribuir a " + (i+1));
			b[i]=Math.pow(a[i], 2);
		}
		System.out.println("-------------------------------");
		System.out.println("Vetor A:");
		for (int i=0;i<5;i++) {
			System.out.print(a[i] + " | ");
			}
		System.out.println("\n");
		System.out.println("Vetor B:");
		for (int i=0;i<5;i++) {
			System.out.print(b[i] + " | ");
			}
	}

}
