package controller;

import util.Teclado;

public class Questao_04 {
	/*
	 * Desenvolver um programa que pergunte oito elementos em um vetor a, construa
	 * um vetor b de mesma dimensão com os elementos do vetor a multiplicados por 3.
	 * Apresente ao final o vetor b. Na exibição, o elemento b[1] deve ser implicado
	 * pelo elemento a[1] * 3, o elemento b[2] implicado pelo a[2] * 3, e assim por
	 * diante, até 8.
	 */

	public static void main(String[] args) {
		int a[]=new int[8];
		int b[]=new int[8];
		
		for (int cont=0;cont<8;cont++) {
			a[cont]=Teclado.lerInt("Qual o número que você deseja multiplicar por 3?");
			b[cont]=a[cont]*3;
			}
		for (int cont=0;cont<8;cont++) {
			System.out.println("O número " + a[cont] + " multiplicado por 3 é " + b[cont]);
		}
		

	}

}
