package controller3;

public class Questao_01 {
	/*
	 * 1) Desenvolver um programa que apresente todos os valores numéricos inteiros
	 * ímpares situados na faixa de 1000 a 1500.
	 */

	public static void main(String[] args) {
		
		for (int cont = 1000; cont <= 1500; cont++) {
			//primeira  = o ponto de partida
			//segunda parte = até onde vai
			//terceira parte = como vai
			
			
			//descubro se é par ou ímpar pelo resto da divisão de dois
			if (cont % 2 != 0) {
			System.out.println(cont);
			}

		}
		
	}
}