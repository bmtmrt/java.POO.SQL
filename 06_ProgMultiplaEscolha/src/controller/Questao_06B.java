package controller;

import util.Teclado;

public class Questao_06B {

	/*
	 * Desenvolver um programa que pergunte o peso de uma pessoa e também pergunte o
	 * código do planeta no qual ela gostaria de obter como resposta o valor do seu
	 * peso neste referido planeta. As informações da tabela abaixo (somente as
	 * colunas Código e Planeta) devem aparecer como menu de escolha ao usuário:
	 * 
	 * 
	 * Código Planeta Gravidade Relativa
	 *	1     Mercúrio        0,37
	 *	2     Vênus           0,88
	 *	3     Marte           0,38
	 *	4     Júpiter         2,64
	 *	5     Saturno         1,15
	 *	6     Urano           1,17
	 *
	 *
	 *pesoNoPlaneta = (pesoNaTerra/10) * gravidadeRelativa.
	 */

	public static void main(String[] args) {
		
		System.out.println("Observe a tabela abaixo \n" + "Código Planeta \n" + "1     Mercúrio \n" + "2     Vênus \n" + "3     Marte \n" + "4     Júpiter \n" + "5     Saturno \n" + "6     Urano \n");
		
		double weight;
		int planet;
		weight=Teclado.lerInt("Qual o seu peso em kg?");
		planet=Teclado.lerInt("Qual o número do planeta que você desejaria viver?");
		
		switch (planet) {
		case 1:
			System.out.println("Seu peso em Mercúrio é " + (weight/10)*0.37 + "N");
			break;
		case 2:
			System.out.println("Seu peso em Vênus é " + (weight/10)*0.88 + "N");
			break;
		case 3:
			System.out.println("Seu peso em Marte é " + (weight/10)*0.38 + "N");
			break;
		case 4:
			System.out.println("Seu peso em Júpiter é " + (weight/10)*2.64 + "N");
			break;
		case 5:
			System.out.println("Seu peso em Saturno é " + (weight/10)*1.15 + "N");
			break;
		case 6:
			System.out.println("Seu peso em Urano é " + (weight/10)*1.17 + "N");
			break;
			
			
		default:
			System.out.println("Planeta não computado, então na Terra você pesa " + weight + "kg.");
		
		}
		
		

	}

}
