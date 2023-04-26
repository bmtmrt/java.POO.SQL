package controller2;

public class Questao_09B {

	/*
	 * Desenvolver um programa que apresente a série de Fibonacci até o décimo
	 * quinto termo. A série de Fibonacci é formada pela sequência
	 * 1,1,2,3,5,8,13,21,34, ... etc. Essa série se caracteriza pela soma de um
	 * termo posterior com o seu anterior subsequente.
	 */

	public static void main(String[] args) {
		int cont=1, acu=0;
		
		do {
			acu+=cont;
			System.out.println(cont);
			System.out.println(acu);
			cont+=acu;
		} while (cont<=15);
		

	}

}
