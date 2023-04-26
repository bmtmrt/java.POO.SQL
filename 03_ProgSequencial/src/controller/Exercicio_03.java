package controller;

import util.Teclado;

public class Exercicio_03 {

	/*
	 * 3) Fazer um programa que pergunte um valor em Dólares e apresente o
	 * equivalente em Reais. Considere U$1,00 = R$5,18
	 */

	public static void main(String[] args) {
		//primeira etapa, entrada de dados
		double dolar, real;
		dolar = Teclado.lerDouble("Digite aqui o valor da quantia em Dólar que você deseja calcular em reais:");
		
		//Segunda etapa, processamento de dados
		real = dolar * 5.18;
		
		//terceira etapa, saída de dados
		System.out.println("A quantia de U$ " + dolar + " equivale a R$ " + real + ".");
		
	}
}
