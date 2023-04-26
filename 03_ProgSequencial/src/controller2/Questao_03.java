package controller2;

import util.Teclado;

public class Questao_03 {
	
	/*
	 * 
	 */

	public static void main(String[] args) {
		double height, weight;
		
		height = Teclado.lerDouble("Digite aqui sua altura em metros:");
		weight = Teclado.lerDouble("Digite aqui seu peso em quilos:");
		
		System.out.println("Sua altura em centímetros é " + height*100 + "cm e seu peso em gramas é " + weight * 1000 + "");

	}

}
