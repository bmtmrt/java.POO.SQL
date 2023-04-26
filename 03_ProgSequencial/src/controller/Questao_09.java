package controller;

import util.Teclado;

public class Questao_09 {

	/*
	 * 9) Fazer um algoritmo que pergunte 1 número e apresente: 
	 * a) O próprio número
	 * b) O quadrado deste número 
	 * c) A raiz quadrada deste número
	 */

	public static void main(String[] args) {
		double n;
		n=Teclado.lerDouble("Digite seu número:");
		System.out.println("O número digitado foi " + n + ", sua raiz quadrada é " + Math.sqrt(n) + " e ele elevado à 2ª potência é " + Math.pow(n,2) + ".");

	}

}
