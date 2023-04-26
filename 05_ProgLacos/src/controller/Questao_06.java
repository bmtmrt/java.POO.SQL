package controller;

import util.Teclado;

public class Questao_06 {

	/*
	 * Desenvolver um programa que leia um número n qualquer menor ou igual a 50 e
	 * apresente o valor obtido da multiplicação sucessiva de n por 3 enquanto o
	 * produto for menor que 250. (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...).
	 */

	public static void main(String[] args) {
		int num;
		
		num = Teclado.lerInt("Digite seu numeral até 50:");
		
		if ( num <= 50 ) {
			//aqui será feito o restante do programa
			
			
			while ( num < 250) {
				System.out.println(num);
				num = num * 3;
				//Coloco aqui o cálculo porque se eu o fizesse dentro do comando IF, estaria multiplicando (e repetindo a resposta) antes mesmo de ter o
				//noovo valor atribuído ao num
			}
			
		} else {
			System.out.println("Erro, número não disponível");
		}
	
	}

}
