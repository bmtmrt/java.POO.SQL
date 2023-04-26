package controller;

import util.Teclado;

public class Questao_04 {

	/*
	 * 4) Desenvolver um programa que pergunte um valor numérico inteiro e faça a
	 * exibição desse valor caso seja divisível por 4 e 5. Não sendo divisível por 4
	 * e 5, o programa deverá exibir a mensagem “Valor não é divisível por 4 e 5”.
	 */

	public static void main(String[] args) {
		// Entrada de dados
		int num, div4, div5;
		num = Teclado.lerInt("Digite seu número:");
		
		// Processamento de dados
		div4 = num % 4;
		div5 = num % 5;
		
		// Saída de dados
		if (div4 == 0 && div5 == 0) {
			System.out.println("Seu número é: " + num);
		} else {
			System.out.println();
		}
		
			
	}
}


