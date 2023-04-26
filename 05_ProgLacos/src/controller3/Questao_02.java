package controller3;

import util.Teclado;

public class Questao_02 {

	/*
	 * Desenvolver um programa que apresente o total da soma de n números inteiros
	 * do número 1 até n, onde n é um valor informado pelo usuário.
	 */

	public static void main(String[] args) {
		//se tem soma, usamos a variável acum
		int n, acum = 0;
		n = Teclado.lerInt("informe um numero");
		
		for (int cont =1; cont <= n; cont ++) {
			acum = acum + cont;
		}
		System.out.println(acum);

	}

}
