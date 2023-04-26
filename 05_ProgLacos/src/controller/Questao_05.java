package controller;

import util.Teclado;

public class Questao_05 {

	/*
	 * Desenvolver um programa que apresente os resultados de uma tabela de um
	 * número qualquer. Ela deve ser impressa no seguinte formato: Considerando como
	 * exemplo o fornecimento do número 2 
	 * 2 . 1 = 2 
	 * 2 . 2 = 4 
	 * 2 . 3 = 6 
	 * 2 . 4 = 8 
	 * 2 . 5 = 10 (...) 
	 * 2 . 10 = 20
	 */

	public static void main(String[] args) {

		int cont = 1, mult, prod;
		
		mult = Teclado.lerInt("Digite aqui o número que deseja ver a tabuada:");
		
		while (cont <= 10) {
			prod = cont*mult;
			System.out.println(cont + " . " + mult + " = " + prod);
			cont++;
		}

	}

}
