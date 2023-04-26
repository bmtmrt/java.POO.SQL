package controller;

import util.Teclado;

public class Questao_07 {

	/*
	 * Fazer um algoritmo que pergunte 3 números e apresente a média aritmética
	 * entre estes 3 números.
	 */

	public static void main(String[] args) {
		int n1, n2, n3, m, sum;
		
		n1=Teclado.lerInt("Digite o Primeiro número:");
		n2=Teclado.lerInt("Digite o Segundo número:");
		n3=Teclado.lerInt("Digite o Terceiro número:");
		
		sum = n1 + n2+ n3;
		m = sum/3;
		
	System.out.println("A média aritmética de " + n1 + ", " + n2 + " e " + n3 + " é igual a " + m + ".");
		

	}

}
