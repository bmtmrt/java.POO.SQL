package controller;

import util.Teclado;

public class Questao_02 {
		
		/*
		 * Desenvolver um programa que permita ao aluno responder qual a capital do Brasil.
		 * O programa deverá exibir se a resposta está certa ou errada.
		 */

	public static void main(String[] args) {
		String bra; 
		bra = Teclado.lerTexto("Qual a capital do Brasil?");
		
		if (bra.equals("Brasilia")) {
				System.out.println("Sim, a capital do Brasil é Brasília");			
			} else {
				System.out.println("A sua resposta está errada.");
			}
		System.out.println("Fim da execução");
	}

}
