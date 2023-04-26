package controller;

import util.Teclado;

public class Exercicio_05 {
	/*
	 * 5) Fazer um programa que pergunte o salário de um funcionário e apresente
	 * este salário com um aumento de 15%
	 */
	public static void main(String[] args) {
		//Entrada de dados
		double wage, raisedwage;
		wage = Teclado.lerDouble("Digite aqui o salário que deseja aumentar em 15%:");
		
		//processamento de dados
		raisedwage = wage + (wage * 15/100);
		
		//saída de dados
		System.out.println("um salário de " + wage + " reais, com reajuste de 15% fica " + raisedwage + " reais.");

	}

}
