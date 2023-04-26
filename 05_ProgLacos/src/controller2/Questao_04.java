package controller2;

import util.Teclado;

public class Questao_04 {

	/*
	 * Desenvolver um programa que apresente os resultados de uma tabuada de um
	 * número n qualquer a ser perguntado ao usuário (n x 1, n x 2, n x 3, ... , n x
	 * 9, n x 10)
	 */

	public static void main(String[] args) {
		int num, prod, cont=1;
		num=Teclado.lerInt("Qual o número que você deseja criar uma tabuada?");
		do {
			prod= num * cont;
			System.out.println( num + " x " + cont + " = " + prod );
			cont++;
		} while (cont < 11);
			

	}

}
