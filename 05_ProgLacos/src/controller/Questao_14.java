package controller;

import util.Teclado;

public class Questao_14 {
	/*
	 * Desenvolver um programa que calcule o fatorial do número 5, ou seja, 5!.
	 * Desta forma, temos que 5! = 5 . 4 . 3 . 2 . 1
	 */
	public static void main(String[] args) {
		int n, cont=1, fat=1;
		n=Teclado.lerInt("Fatore esse número:");
		
		
		
		while ( cont <= n) {
			fat = fat*cont;//expressão de calculo fatorial
			cont++;
		}
		
		
		System.out.println(fat);
	}

}
