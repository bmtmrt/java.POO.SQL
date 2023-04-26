package controller2;

import util.Teclado;

public class Questao_04 {

	/*
	 * 4) Desenvolver um programa que pergunte ao usuário o seu peso e sua altura.
	 * Ao final o programa deverá exibir na tela o valor do índice de massa corporal
	 * desta pessoa (IMC). 
	 * Fórmula: IMC = peso / altura2 - Obs: peso em quilos e altura em metros.
	 */

	public static void main(String[] args) {
		double alt, pes, imc;
		alt = Teclado.lerDouble("Quanto você mede?");
		pes = Teclado.lerDouble("Quanto você pesa?");
		
		imc = pes / (Math.pow(alt, 2));
		
		System.out.println("Visto que você mede " + alt + "m e pesa " + pes + "kg. Seu IMC é igual a " + imc);

	}

}
