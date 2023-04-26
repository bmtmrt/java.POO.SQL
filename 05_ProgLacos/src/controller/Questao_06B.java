package controller;

import util.Teclado;

public class Questao_06B {

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
				num = num * 3;
				
				
				
				if ( num >= 250 ) {
					break; //esse comando tem a função de "quebrar" o loop. Nesse caso, o looping tá sendo quebrado quando a variável num for maior ou igual a 250
				}
				
				
				
				
				System.out.println(num);
				
				//Coloco aqui o cálculo porque se eu o fizesse dentro do comando IF, estaria multiplicando (e repetindo a resposta) antes mesmo de ter o
				//noovo valor atribuído ao num
			}
			
		} else {
			System.out.println("Erro, número não disponível");
		}
	
	}

}
