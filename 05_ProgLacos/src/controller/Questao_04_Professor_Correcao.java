package controller;

public class Questao_04_Professor_Correcao {

	/*
	 * Desenvolver um programa que apresente o valor da soma dos cem primeiros
	 * números inteiros (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100).
	 */

	public static void main(String[] args) {
		int cont = 1, ac = 0;
		
		while (cont <= 100) {
			ac = ac + cont; //O acumulador guarda o valor somado ao acumulado anteriormente
			//A variável ac recebe ela mesma mais o cont
			cont ++;//cont = cont + 1;
			//Preciso de uma variável acumuladora. Ela sempre acumula junto de outra variável. Aqui no caso, o acumulador receberá o acumulador + o contador
		}
		System.out.println(ac);
	}
}
