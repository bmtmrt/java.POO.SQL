package controller;

import util.Teclado;

public class LacoTesteInicio_01 {

	/*
	 * Algoritmo para pedir a leitura de um valor para a variável x, multiplicar
	 * este valor por 3, colocar o valor obtido na variável r, e apresentar o valor
	 * de r, repetindo a sequência cinco vezes.
	 */

	public static void main(String[] args) {
		//Entrada de dados
		int x, r;
		x = Teclado.lerInt("Digite aqui seu número:");
		
		//Processamento de dados
		r = x * 3;
		
		//Saída de dados
		System.out.println(x + " multiplicado por 3 é igual a " + r);
		
	}

}
