package controller;

import util.Teclado;

public class Questao_10 {

	/*
	 * Desenvolver um programa que pergunte dois números inteiros, e apresente como
	 * resultado se o segundo número informado é ou não um divisor do primeiro
	 * número informado.
	 */

	public static void main(String[] args) {
		int num1, num2;
		num1 = Teclado.lerInt("Digite o primeiro número");
		num2 = Teclado.lerInt("Digite o segundo número");
		
		if (num1 % num2 == 0) {
			System.out.println(num2 + " é divisor de " + num1);
		} else {
			System.out.println(num2 + " NÃO é divisor de " + num1);
		}
	}

}
