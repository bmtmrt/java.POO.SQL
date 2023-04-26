package controller;

import util.Teclado;

/*
 * 1) Desenvolver um programa que pergunte ao usuário o seu nome completo e seu sexo. Em seguida, o programa
deve apresentar os dados anteriormente informados.
 */


public class Exercicio_01 {

	public static void main(String[] args) {
		String name, gender;
		//entrada de dados
		name = Teclado.lerTexto("Qual o seu nome inteiro?");
		gender = Teclado.lerTexto("Qual o gênero que você se identifica?");
		//não há processamento, visto que o programa apenas mostrará as respostas
		//saída de dados
		System.out.println("Seu nome é " + name + ", e você se identifica como sendo do gênero " + gender + ".");
		
	}

}
