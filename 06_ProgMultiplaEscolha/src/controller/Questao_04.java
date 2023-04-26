package controller;

import util.Teclado;

public class Questao_04 {

	/*
	 * Desenvolver um programa que pergunte a sigla do estado onde a pessoa reside,
	 * e apresente uma das seguintes alternativas como resposta: Carioca, Paulista,
	 * Mineiro, Outros Estados.
	 */

	public static void main(String[] args) {
		String state;
		state=Teclado.lerTexto("Qual o estado que você nasceu?");
		state=state.toLowerCase();
		
		switch (state) {
			case "rio de janeiro":
			case "rj":
			case "rio":
				System.out.println("Você é Carioca");
				break;
				
			case "sp":
			case "são paulo":
			case "sao paulo":
				System.out.println("Você é Paulista");
				break;
				
			case "minas":
			case "mg":
			case "minas gerais":
				System.out.println("Você é mineiro");
				break;
				
			default:
				System.out.println("Ainda não foi computado o adjetivo pátrio para seu Estado.");
				break;
		}
		

	}

}
