package controller;

import util.Teclado;

public class Questao_05 {

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
		String situacao;
		note1 = Teclado.lerDouble("Nota do primeiro trimestre:");
		note2 = Teclado.lerDouble("Nota do segundo trimestre:");
		note3 = Teclado.lerDouble("Nota do terceiro trimestre:");
		note4 = Teclado.lerDouble("Nota do quarto trimestre:");
		// Segunda etapa, processamento de dados
		media = (note1 + note2 + note3 + note4) / 4;
		if (media >= 5) {
			situacao = "Aprovado";
		} else {
			situacao = "Reprovado";
		}
		// Terceira etapa, saída de dados
		System.out.println("Média: " + media + " - Situação: " + situacao);
	}

}
