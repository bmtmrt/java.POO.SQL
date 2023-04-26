package controller;

import util.Teclado;

public class ExemploMultiplaEscolhaString {

	public static void main(String[] args) {
		String estado;
		estado = Teclado.lerTexto("Informe a sigla de um Estado Hu3Hu3BR!");
		
		//Posso utilizar o comando .toLowerCase() em Java pra poder aceitar qualquer escrita e convertê-la para minúscula.
		
		estado = estado.toLowerCase();
		switch (estado) {
		//case "RJ":
		case "rj":
		//case "Rj":
		//case "rJ":
			System.out.println("Rio de Janeiro");
			break;
			
		default:
			System.out.println("Não é Rio de Janeiro");
			break;
		}

	}

}
