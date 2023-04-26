package controller;

import util.Teclado;

public class Questao_01_Correcao {

	public static void main(String[] args) { 	

		double numero, metade;
		
		numero = Teclado.lerDouble("Informe o numero:");
		
		if (numero>20) {
			metade = numero/2;
			System.out.println("A metade de" + numero + "é" + metade);
		} else {
			System.out.println("O seu número é menor que vinte, portanto não tem alteração" + numero);
		}
	}

}
 