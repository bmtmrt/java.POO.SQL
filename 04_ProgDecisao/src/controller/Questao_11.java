package controller;

import util.Teclado;

public class Questao_11 {

	/*
	 * Desenvolver um programa que pergunte um número de 3 casas e apresente como
	 * resultado somente o algarismo das centenas.
	 * 
	 */

	public static void main(String[] args) {
		int num, numCent;
		num = Teclado.lerInt("Digite seu número de 3 casas");
		
		
		//Eu tinha utilizado o comando double para programar essa questão
		//não foi a melhor decisão pois double aceitam casas decimais após
		//a vírgula. Utilizar o comando int me permite programar isso de forma
		// mais fácil.
		
		
		//processamento de dados
		numCent = num / 100;
		
		//saída de dados
		if (num>99 && num<=999) {
			System.out.println("O primeiro digito do seu numeral é " + numCent);
		} else {
			System.out.println("Seu número não foi reconhecido");
		}
		
	}

}
