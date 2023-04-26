package controller2;

public class Questao_06 {

	/*
	 * Desenvolver um programa que apresente os quadrados dos números inteiros de 2
	 * a 50.
	 */

	public static void main(String[] args) {
		int cont=2;
		
		do {
			System.out.println(Math.pow(cont,2));
			cont++;
		} while (cont<=50);

	}

}
