package controller;

import util.Teclado;

public class Questao_03_1 {

	/*
	 * 3) Desenvolver um programa que pergunte um número, e apresente como resposta
	 * se o referido número é par ou é ímpar.
	 */

	public static void main(String[] args) {
		// primeira etapa, entrada de dados
		double num;
		num = Teclado.lerDouble("Digite seu número: ");
		// segunda etapa, processamento de dados
		// terceira etapa, saída de dados
		if (num%2 == 0) {
			System.out.println("Esse número é par.");
		} else {
			System.out.println("Esse número é ímpar.");
		}
		

	}

}
