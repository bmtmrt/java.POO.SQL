package controller;

import util.Teclado;

public class Questao_02_Correcao_02 {

	public static void main(String[] args) {
		String Capital;
		Capital=Teclado.lerTexto("Informe a capital do Brasil");
		
		if (Capital.equals("Brasília") || Capital.equals("brasília") || Capital.equals("Brasilia") || Capital.equals("brasilia")) {
			System.out.println("Parabéns! Você acertou!");
		} else {
			System.out.println("Infelizmente você errou...");
		}
		
		
	}

}
