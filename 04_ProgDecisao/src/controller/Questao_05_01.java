package controller;

import util.Teclado;

public class Questao_05_01 {

	/*
	 * 5) Desenvolver um programa que pergunte 4 notas escolares de um aluno e exiba
	 * mensagem informando que o aluno foi aprovado se a média escolar for maior ou
	 * igual a 5. Se o aluno não foi aprovado, indicar uma mensagem informando essa
	 * condição. Apresentar junto com a mensagem de aprovação ou reprovação o valor
	 * da média obtida pelo aluno.
	 */

	public static void main(String[] args) {
		// Primeira etapa, entrada de dados
		double note1, note2, note3, note4, media;
		note1 = Teclado.lerDouble("Nota do primeiro trimestre:");
		note2 = Teclado.lerDouble("Nota do segundo trimestre:");
		note3 = Teclado.lerDouble("Nota do terceiro trimestre:");
		note4 = Teclado.lerDouble("Nota do quarto trimestre:");
		// Segunda etapa, processamento de dados
		media = (note1 + note2 + note3 + note4) / 4;
		// Terceira etapa, saída de dados
		if (media >= 5) {
			System.out.println("Sua média é " + media + " e está acima da média da escola. Portanto você está Aprovado.");
		} else {
			System.out.println("Sua média é " + media + " e está abaixo da média da escola. Portanto você está Reprovado.");
		}

	}

}
