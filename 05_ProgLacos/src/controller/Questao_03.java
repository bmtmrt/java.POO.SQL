package controller;

public class Questao_03 {
	
	/*
	 * Desenvolver um programa que apresente os quadrados dos números inteiros de 15 a 200.
	 */

	public static void main(String[] args) {
		int cont = 15;
		
		while (cont <= 200) { //enquanto esse contador for menor ou igual a 200
			System.out.println(Math.pow(cont, 2)); //vou elevar esse contador à segunda potência
			cont = cont + 1; //Aí então, repetirei com o contador + 1
		}

	}

}
