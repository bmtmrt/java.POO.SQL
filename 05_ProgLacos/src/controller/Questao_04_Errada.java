package controller;

public class Questao_04_Errada {

	/*
	 * Desenvolver um programa que apresente o valor da soma dos cem primeiros
	 * números inteiros (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100).
	 */

	public static void main(String[] args) {
		int cont = 0;
		
		while (cont <= 99) { 
			System.out.println(cont + (cont + 1));
			cont = cont + 1; 
		}
		//enquanto esse contador for menor ou igual a 100	
		//Preciso somar o cont com o cont + 1
		//Aí então, repetirei com o contador + 1
	}
}
