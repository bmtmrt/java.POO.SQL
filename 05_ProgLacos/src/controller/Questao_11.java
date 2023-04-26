package controller;

import util.Teclado;

public class Questao_11 {

	/*
	 * Elaborar um programa que apresente o valor de uma potência de uma base
	 * qualquer (Variável b) elevada a um expoente qualquer (Variável e), ou seja,
	 * de be
	 * 
	 * . (Sem usar Math.pow();)
	 * 
	 */

	public static void main(String[] args) {
		double b, e, bE=1;
		//no caso, a variável bE aqui está agindo como se fosse uma variável acumuladora. Isto posto, colocaremos como 1 primeiro, que daí em diante serão apenas repetições.
		int cont = 1;
		
		b=Teclado.lerInt("Qual será a variável b que será elevada?");
		e=Teclado.lerInt("Será elevada a qual potência?");
		
		while (cont <= e) {
			bE=bE*b;
			cont++;
		}
		System.out.println(b+" elevado a "+e+" é igual a "+bE);

	}

}
