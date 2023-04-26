package controller;

import util.Teclado;

public class Exercicio_04 {

	/*
	 * 4) Fazer um programa que pergunte um número inteiro e apresente o seu
	 * antecessor e seu sucessor.
	 */

	public static void main(String[] args) {
		//primeira etapa, entrada de dados
		int num, ant, post;
		num = Teclado.lerInt("Digite um número para descobrir seu antecessor e seu sucessor:");
		//segunda etapa, processamento de dados
		ant = num - 1;
		post = num + 1;
		//terceira etapa, saída de dados		
		System.out.println("O número escolhido foi: " + num +". o seu antecessor é o número " + ant + ", e seu sucessor é o número " + post + ".");
	}

}
