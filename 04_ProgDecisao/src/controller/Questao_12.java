package controller;

import util.Teclado;

public class Questao_12 {

	/*
	 * Desenvolver um programa que pergunte 5 números inteiros e identifique o maior
	 * número e o menor número.
	 */

	public static void main(String[] args) {
		//entrada de dados
		int num1, num2, num3, num4, num5, hiNum, loNum;
		num1 = Teclado.lerInt("Digite o primeiro número:");
		num2 = Teclado.lerInt("Digite o segundo número:");
		num3 = Teclado.lerInt("Digite o terceiro número:");
		num4 = Teclado.lerInt("Digite o quarto número:");
		num5 = Teclado.lerInt("Digite o quinto número:");
		
		//processamento de dados
		hiNum = num1;
		if (num2>hiNum) {
			hiNum = num2;
		} else if (num3>hiNum) {
			hiNum = num3;
		} else if (num4>hiNum) {
			hiNum = num4;
		} else if (num5>hiNum) {
			hiNum = num5;
		}	
		
		loNum = num1;
		if (num2<loNum) {
			loNum = num2;
		} else if (num3<loNum) {
			loNum = num3;
		} else if (num4<loNum) {
			loNum = num4;
		} else if (num5<loNum) {
			loNum = num5;
		}
		
		//saída de dados
		System.out.println("O maior número dentre os escolhidos é " + hiNum);
		System.out.println("O menor número dentre os escolhidos é " + loNum);
	}
}
