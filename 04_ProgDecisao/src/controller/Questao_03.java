package controller;

import util.Teclado;

public class Questao_03 {

	/*
	 * 3) Desenvolver um programa que pergunte um número, e apresente como resposta
	 * se o referido número é par ou é ímpar.
	 */

	public static void main(String[] args) {
		// primeira etapa, entrada de dados
		int num, rest;
		num = Teclado.lerInt("Digite seu número: ");

		// segunda etapa, processamento de dados
		rest = num % 2;

		// terceira etapa, saída de dados
		if (rest < 1) {
			System.out.println("Esse número é par.");
		} else {
			System.out.println("Esse número é ímpar.");
		}

		/*
		 * Poderia ser também assim:
		 * 
		 * if (rest == 0) { 
		 * 	System.out.println("Esse número é par."); 
		 * } else {
		 * 	System.out.println("Esse número é ímpar."); 
		 * }
		 * 
		 * Se você colocar apenas um sinal de igual "=", você explicando ao computador
		 * que o número receberá a quantia em questão.
		 */

	}

}
