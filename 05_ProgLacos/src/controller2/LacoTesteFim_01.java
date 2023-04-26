package controller2;

import util.Teclado;

public class LacoTesteFim_01 {
	/*
	 * Algoritmo para pedir a leitura de um valor para a variável x, multiplicar
	 * este valor por 3, colocar o valor obtido na variável r, e apresentar o valor
	 * de r, repetindo a sequência cinco vezes.
	 */
	public static void main(String[] args) {
		int x, r, cont;
		
		cont = 1;
		
		do {
			x = Teclado.lerInt("Informe um número para atribuir à variável x: ");
			r = x * 3;
			System.out.println(x + " multiplicado por 3 é igual a " + r);
			cont++;
		} while (cont <= 5);
		
	}
		
}


