package controller;

import util.Teclado;

public class Questao_03 {

	/*
	 * Desenvolver um programa que pergunte um número e informe como resposta se o
	 * número informado é par ou é ímpar.
	 */

	public static void main(String[] args) {
		int num, root;
		
		num=Teclado.lerInt("Digite o número:");
		
		root=num%2;
		
		switch (root) {
		case 0:
			System.out.println("Seu número é par.");
			break;
		default:
			System.out.println("Seu número é ímpar");
		}

	}

}
