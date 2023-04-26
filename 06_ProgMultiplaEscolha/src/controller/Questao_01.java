package controller;

import util.Teclado;

public class Questao_01 {
	/*
	 * Desenvolver um programa que mostre o menu de opções da tabela abaixo e peça o
	 * código desejado. Mostre como resposta uma mensagem confirmando a escolha do
	 * usuário, ou que o número digitado não existe no menu de opções.
	 * 
	 * Código - Opção
	 *     1  - Incluir
	 *     2  - Alterar
	 *     3  - Excluir
	 *     4  - Pesquisar
	 *     5  - Sair
	 */

	public static void main(String[] args) {
		int choice;
		
		System.out.println("Pressione 1 para Incluir;");
		System.out.println("Pressione 2 para Alterar;");
		System.out.println("Pressione 3 para Excluir;");
		System.out.println("Pressione 4 para Pesquisar;");
		System.out.println("Pressione 5 para Sair;");
		//System.out.println("Pressione 1 para Incluir; \n" + "Pressione 2 para alterar; \n" +"Pressione 3 para Excluir; \n" +"Pressione 4 para Pesquisar; \n" +"Pressione 5 para Sair.");
		
		choice = Teclado.lerInt("O que você deseja escolher?");
		
		switch (choice) {
			case 1:
				System.out.println("Sua escolha foi de incluir");
				break;
			case 2:
				System.out.println("Sua escolha foi de alterar");
				break;
			case 3:
				System.out.println("Sua escolha foi de excluir");
				break;
			case 4:
				System.out.println("Sua escolha foi de pesquisar");
				break;
			case 5:
				System.out.println("Sua escolha foi de sair");
				break;
			default:
				System.out.println("Sua escolha não pôde ser processada");
				break;
		}
		
	}

}
