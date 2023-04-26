package controller2;

public class Questao_01 {

	/*
	 * Desenvolver um programa que apresente todos os valores numéricos inteiros
	 * pares situados na faixa de 100 a 200.
	 */

	public static void main(String[] args) {
		int cont = 100;
		
		do {
			System.out.print(cont + " "); //println passe para próxima linha.
			cont = cont + 2;
		} while ( cont <= 200 ); 
	}

}
