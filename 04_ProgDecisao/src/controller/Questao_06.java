package controller;

import util.Teclado;

public class Questao_06 {

	/*
	 * Desenvolver um programa que pergunte dois valores numéricos inteiros e
	 * apresente o valor da diferença entre o maior valor e o menor valor lido.
	 */

	public static void main(String[] args) {
		int num1, num2, dif;
		num1 = Teclado.lerInt("Digite o primeiro número:");
		num2 = Teclado.lerInt("Digite o segundo número:");
		
		if (num1>num2) {
			dif=num1-num2;
			System.out.println("A diferença entre " + num1 + " e " + num2 + " é igual a " + dif);
		} else {
			dif=num2-num1;
			System.out.println("A diferença entre " + num2 + " e " + num1 + " é igual a " + dif);
		}

	}

}
