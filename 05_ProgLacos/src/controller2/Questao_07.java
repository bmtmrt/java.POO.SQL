package controller2;

public class Questao_07 {

	/*
	 * Desenvolver um programa que apresente as potências de 2, variando de 0 a 10
	 */

	public static void main(String[] args) {
		int cont=0;
		
		do {
			System.out.println(Math.pow(cont, 2));
			cont++;
		} while (cont<=10);

	}

}
