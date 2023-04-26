package controller;

import util.Teclado;

/*
 * 2) Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados:
a) Resultado de suas adições
b) Resultado de suas multiplicações
 */

public class Exercicio_02 {

	public static void main(String[] args) {
		//primeira etapa, entrada de dados
		int num1, num2, num3, num4, sum, product;
		
		num1 = Teclado.lerInt("Digite o primeiro número:");
		num2 = Teclado.lerInt("Digite o segundo número:");
		num3 = Teclado.lerInt("Digite o terceiro número:");
		num4 = Teclado.lerInt("Digite o quarto número:");
		
		//segunda etapa, processamento de dados
		sum = num1+num2+num3+num4;
		product = num1*num2*num3*num4;
		
		//terceira etapa, saída de dados
		System.out.println("A soma dos números digitados é: " + sum + " e o produto deles é " + product + ".");
		
	}

}
