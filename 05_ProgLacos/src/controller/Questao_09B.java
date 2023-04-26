package controller;

public class Questao_09B {
	/*
	 * Elaborar um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 até 500. Utilize um laço que efetue a variação de 1 em 1
	 * em 2.
	 */
	public static void main(String[] args) {
		// Primeiro vamos nos concentrar em ir de 0 a 500. Vamos criar uma variável contadora
		int cont = 0, acum = 0; // acum é uma variável que se comporta acumulando valores, pois vai somar todos os valores de outra variável
		
		//Testarei o ponto final dessa variável até que o comando seja completado, no caso, 
		while ( cont <= 500 ) {
			if ( cont % 2 == 0) {
				acum = acum + cont; 
			}
			cont = cont + 1; //Incremento do contador, nesse caso começamos com 0 e somamos 2 porque apenas desejamos os números pares.
		}
		System.out.println("A soma dos números pares de 0 a 500 é " + acum);

	}

}
