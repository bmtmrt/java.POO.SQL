package controller2;

public class Questao_02B {
	/*
	 * Desenvolver um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 até 500. Utilize um laço que varie de 2 em 2.
	 */

	public static void main(String[] args) {
		int acum = 0, cont = 0;
		
		do {
			acum += cont; 	//acum = acum + cont;
			cont += 2; 		//cont = cont + 2;
		} while ( cont <= 500 );
		System.out.println(acum);
	}

}
