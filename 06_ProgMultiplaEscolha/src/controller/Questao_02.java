package controller;

import util.Teclado;

public class Questao_02 {
	/*
	 * Desenvolver um programa que pergunte o sexo da pessoa e dê como resposta a
	 * seguinte orientação de acordo com o sexo informado: “Banheiro masculino à
	 * direita” ou “Banheiro feminino à esquerda”.
	 */

	public static void main(String[] args) {
		String gen;
		gen = Teclado.lerTexto("Qual é o seu gênero?");
		
		gen = gen.toLowerCase();
		
		switch (gen) {
		case "homem":
		case "h":
		case "masculino":
		case "masc":
		case "m":
			System.out.println("Banheiro masculino à direita");
			break;
		case "mulher":
		case "feminino":
		case "fem":
		case "f":
			System.out.println("Banheiro feminino à esquerda");
			break;
		default:
			System.out.println("Sua escolha não pôde ser processada");
			break;
		}

	}

}
