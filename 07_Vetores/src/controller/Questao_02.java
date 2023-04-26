package controller;

import util.Teclado;

public class Questao_02 {
	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
	 * apresente a soma de todos os elementos deste vetor.
	 */
	public static void main(String[] args) {
		int a[] = new int[5];
		int acum = 0; //começa 0 para soma ou subtração e 1 para divisão ou multiplicação
		//(onde começa;até onde vai;como é feita essa contagem)
		for (int cont = 0; cont < 5; cont++) {
			a[cont]=Teclado.lerInt("Insira um número referente ao " + (cont + 1) + "º índice do vetor a.");
			acum+=a[cont];
			//aqui pedimos números ao usuário para preencher o vetor unido à soma
		}
		System.out.println("A soma dos 5 valores guardados é " + acum + ".");
		
	}
}
