package controller;

import util.Teclado;

public class Questao_06 {

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
		
		double weight, planWeight=0;
		int planet;
		boolean error = false;
		
		weight=Teclado.lerInt("Qual o seu peso em kg?");
		planet=Teclado.lerInt("Qual o número do planeta que você desejaria viver?");
		
		switch (planet) {
		case 1:
			planWeight=0.37;
			break;
		case 2:
			planWeight=0.88;
			break;
		case 3:
			planWeight=0.38;
			break;
		case 4:
			planWeight=2.64;
			break;
		case 5:
			planWeight=1.15;
			break;
		case 6:
			planWeight=1.17;
			break;
			
			
		default:
			error=true;
		
		}
		if (error==false) {
			System.out.println("Seu peso no planeta escolhido é de " + (weight/10)*planWeight + "kg.");
		} else {
			System.out.println("Planeta não computado, então na Terra você pesa " + weight + "kg.");
		}
		
		

	}

}
