package controller;

import util.Teclado;

public class Questao_01 {

	/*
	 * Crie 2 vetores chamados nome e profissao, cada um com 5 elementos. Pergunte
	 * ao usuário o nome e a profissão de 5 pessoas e preencha estes vetores. Ao
	 * final exiba um relatório apontando o nome e a profissão de cada uma das 5
	 * pessoas cadastradas.
	 */

	public static void main(String[] args) {
		String name[] = new String [5];
		String prof[] = new String [5];
		
		for (int cont = 0; cont < 5 ; cont++) {
			name[cont]=Teclado.lerTexto("Informe o nome do trabalhador 0" +(cont+1));
			prof[cont]=Teclado.lerTexto("Informe a profissão do trabalhador 0" +(cont+1));
		}
		System.out.println("\n--- Relatório de nomes e profissões ---\n");
		for (int cont = 0; cont < 5 ; cont++) {
			System.out.println((cont+1) + " - " + name[cont] + " é " + prof[cont]);
		}
	}

}
