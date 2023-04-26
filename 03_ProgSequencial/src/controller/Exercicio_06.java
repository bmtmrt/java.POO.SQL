package controller;

import util.Teclado;

public class Exercicio_06 {
	/*
	 * 6) Fazer um programa que pergunte uma temperatura ao usuário, em graus
	 * Fahrenheit, e apresente esta temperatura convertida em graus Celsius. A
	 * fórmula da conversão é c = (f – 32) x 5 : 9 , onde c é a temperatura em graus
	 * Celsius e f em Fahrenheit.
	 */
	public static void main(String[] args) {
		//entrada de dados
		double fahrenheit, celcius;
		fahrenheit = Teclado.lerDouble("digite aqui a sua temperatura em graus fahrenheit:");
		//processamento de dados
		celcius = (fahrenheit-32)*5/9;
		//saida de dados
		System.out.println("O valor da sua temperatura em graus Celcius é de " + celcius + "°C.");
	}

}
