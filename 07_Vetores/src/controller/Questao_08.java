package controller;

import util.Teclado;

public class Questao_08 {
	/*
	 * Desenvolver um programa que armazene nome e nota das PR1 e PR2 de 15 alunos,
	 * calcule e armazene a média, armazene também a situação do aluno (AP ou RP).
	 * Exibir ao final uma listagem contendo nomes, notas, médias e situação de cada
	 * aluno.
	 */

	public static void main(String[] args) {
		String name[]=new String[15];
		double pr[]=new double[15];
		double pr2[]=new double[15];
		double media[]=new double[15];
		String situation[]=new String[15];
		
		for (int cont=0;cont<15;cont++) {
			name[cont]=Teclado.lerTexto("informe o nome do aluno " + (cont+1));
			pr[cont]=Teclado.lerDouble("informe a nota do aluno " + name[cont]);
			pr2[cont]=Teclado.lerDouble("informe a nota do aluno " + name[cont]);
			media[cont]=(pr[cont]+pr2[cont])/2;
			if (media[cont] >= 7) {
				situation[cont]= "Aprovada(o)";
			} else {
				situation[cont]="Reprovada(o)";
			}
			System.out.println("------------------------------");//usaremos isso aqui para espaçar entre as perguntas
		}
		System.out.println("###   Boletim   ###");
		for (int cont=0;cont<15;cont++) {
			System.out.println("Aluno: " + name[cont] + "\n Nota da primeira prova:" + pr[cont] + "\n Nota da segunda prova: " + pr2[cont] + "\n Média: " + media[cont] + "\n Situação: " + situation[cont]);
			System.out.println("-----------------------------");
			
		}
	}

}
