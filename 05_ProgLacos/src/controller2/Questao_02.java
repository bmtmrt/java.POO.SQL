package controller2;

public class Questao_02 {
	/*
	 * Desenvolver um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 até 500. Utilize um laço que varie de 1 em 1.
	 */

	public static void main(String[] args) {
		int acum = 0, cont = 0;
		
		do {
			if (cont % 2 == 0 )
			acum += cont; 	//acum = acum + cont;
			cont += 1; 		//cont = cont + 1;
		} while ( cont <= 500 );
		System.out.println(acum);
	}

}
