package controller2;

import util.Teclado;

public class Questao_08 {
	/*
	 * Desenvolver um programa que apresente o valor de uma potência de uma base
	 * qualquer elevada a um expoente qualquer, ou seja, de be .
	 */

	public static void main(String[] args) {
		int b, e, prod=1, cont=1;
		
		b=Teclado.lerInt("Qual o número que será base?");
		e=Teclado.lerInt("Qual o expoente?");
		
		do {
			prod=prod*b;
			cont++;
		} while (cont<=e);
		System.out.println(b+" elevado a "+e+" é igual a "+prod);
	}

}
