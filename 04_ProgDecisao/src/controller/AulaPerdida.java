package controller;

import util.Teclado;

public class AulaPerdida {
	/*
	 * Algoritmo para ler dois valores numéricos, efetuar a adição e apresentar o
	 * resultado se o valor for maior que 10.
	 */
	
	public static void main(String[] args) {
		// entrada de dados
		int num1, num2, sum;
		num1 = Teclado.lerInt("Digite aqui o primeiro número:");
		num2 = Teclado.lerInt("Digite aqui o segundo número:");
		// processamento de dados
		sum = num1 + num2;
		// saida de dados
		if (sum >= 10) {
			System.out.println("O valor da soma é superior a 10, é " + sum);
		} else {
			System.out.println("O valor da soma é inferior a 10, é " + sum);
		}

	}

}
