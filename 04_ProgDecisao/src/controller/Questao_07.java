package controller;

import util.Teclado;

public class Questao_07 {

	/*
	 * Desenvolver um programa que pergunte um valor inteiro positivo ou negativo, e
	 * exiba como resposta o módulo deste valor, ou seja, o número lido como sendo
	 * positivo.
	 */

	public static void main(String[] args) {
		int num;
		num = Teclado.lerInt("Digite seu número: ");
		
		if (num>0) {
			System.out.println("O módulo de seu número é |" + num + "|");
		} else {
			System.out.println("O módulo de seu número é |" + num * -1 + "|");
		}
	
	}

}
