package controller;

import util.Teclado;

public class Questao_05 {

	/*
	 * Desenvolver um programa que crie uma matriz de 4 linhas e 4 colunas. 
	 * 
	 * Pergunte ao usuário nomes de pessoas para preencher toda a matriz. 
	 * 
	 * Em seguida o programa perguntará ao usuário as coordenadas (linha e coluna) que deseja
	 * visualizar o conteúdo correspondente na matriz.
	 * 
	 * Enquanto o usuário informar coordenadas válidas, o programa exibirá o conteúdo correspondente.
	 * 
	 * No momento em que forem inseridas coordenadas não válidas o programa será encerrado com
	 * a mensagem na tela “Coordenadas inválidas”.
	 * 
	 */

	public static void main(String[] args) {
		String a[][] = new String [4][4];
		int i, j;
		
		for (i=0;i<4;i++) {			
			for (j=0; j<4;j++) {
				a[i][j]=Teclado.lerTexto("Digite o nome da pessoa para alocar na posição " + (i+1) + "." + (j+1));
			}
		}
		
		System.out.println("--------Pesquise-------");
		
		i=Teclado.lerInt("Qual a coordenada que você deseja pesquisar em linha?");
		j=Teclado.lerInt("Qual a coordenada que você deseja pesquisar em linha?");
		if (i<4 && j<4) {
			i=i-1;
			j=j-1;
			System.out.println("o nome referente à posição " + (i+1) + "|" + (j+1) + " é " + a[i][j]);
		} else {
			System.out.println("Nada encontrado");
		}
		
		
	}

}
