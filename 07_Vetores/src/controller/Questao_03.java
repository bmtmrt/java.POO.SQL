package controller;

import util.Teclado;

public class Questao_03 {
	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
	 * apresente a soma de todos os elementos que sejam ímpares.
	 */

	public static void main(String[] args) {
		int a[] = new int[5];
		int acum = 0;
		// (onde começa;até onde vai;como é feita essa contagem)
		for (int cont = 0; cont < 5; cont++) {
			a[cont] = Teclado.lerInt("Insira um número referente ao " + (cont + 1) + "º índice do vetor a.");
			//agora, para valodar se o número é impar, utilizamos um comando if
			if (a[cont]%2==1) {
				acum += a[cont];
			}
			// aqui pedimos números ao usuário para preencher o vetor unido à soma
		}
		System.out.println("A soma dos números ímpares guardados é " + acum + ".");
	}

}
