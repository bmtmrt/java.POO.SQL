package controller;

import util.Teclado;

public class Questao_07 {
	/*
	 * Crie um vetor chamado semana com 7 elementos já contendo todos os nomes por
	 * extenso dos dias da semana. Em seguida pergunte ao usuário um número e
	 * apresente o dia correspondente ao número no vetor, ou exiba a mensagem
	 * “Número não corresponde a um dia da semana.
	 */

	public static void main(String[] args) {
		String week[] = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
		int i;
		
		i=Teclado.lerInt("Digite o número do dia desejado:");
		
		if (i>=1 && i<=7) {
			System.out.println(week[i-1]);
		} else {
			System.out.println("Cê não sabe contar não?");
		}
		
	}
}
