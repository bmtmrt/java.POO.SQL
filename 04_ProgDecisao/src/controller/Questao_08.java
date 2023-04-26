package controller;

import util.Teclado;

public class Questao_08 {
	/*
	 * Desenvolver um programa que pergunte um número inteiro qualquer e verifique
	 * se ele está na faixa de 1 a 10.
	 */

	public static void main(String[] args) {
		//entrada de dados
		int num;
		num = Teclado.lerInt("Digite seu número");
		//processamento de dados
		if ((num>=1) && (num<=10)) {
			System.out.println("Seu número é " + num + " e está entre 1 e 10.");
		} else {
			System.out.println("Seu número é " + num + " e NÃO está entre 1 e 10.");
		}
		//saída de dados
	}

}
