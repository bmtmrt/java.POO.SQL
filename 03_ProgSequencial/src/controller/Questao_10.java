package controller;

import util.Teclado;

public class Questao_10 {

	/*
	 * 10) Fazer um algoritmo que efetue o cálculo do valor de uma prestação em
	 * atraso, utilizando a fórmula:
	 * prestação = valor + (valor x (taxa : 100) x tempo em dias)
	 */

	public static void main(String[] args) {
		//ETRADA DE DADOS
		double prest, valor, taxa;
		int tempo;
		//prestação é o que o Cliente busca.
		//Qual é o valor?
		valor=Teclado.lerDouble("Qual o valor que será calculado?");
		//Qual é a taxa que a loja cobra?
		taxa=Teclado.lerDouble("Qual será a taxa incidente?");
		//Há quanto tempo está atrasado?
		tempo=Teclado.lerInt("Há quanto tempo este valor está atrasado?");

		//PROCESSAMENTO DE DADOS
		prest = valor + (valor * (taxa / 100) * tempo);
		
		//SAÍDA DE DADOS
		System.out.println("A prestação a ser paga é de " + prest + ". Visto que o valor devido é de R$ " + valor + ", a taxa cobrada diariamente é de R$ " + taxa + " num total de " + tempo + " dias.");
		
	}

}
