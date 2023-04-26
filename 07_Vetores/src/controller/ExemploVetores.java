package controller;

import util.Teclado;

public class ExemploVetores {
	
	//Elaborar um programa de computador que pergunte o nome de 10 pessoas e ao final apresente uma lista com os nomes:

	public static void main(String[] args) {
		
		//declarar um vetor do tipo String com 10 posições:
		
		String nomes[] = new String [10];
		
//		se eu quiser atribuir um nome à posição 3:
		
//		nomes[2] = "Ana";
		
//		na posição 6:
		
//		nomes[5] = "João";
//		System.out.println(nomes[2] + "\n" + nomes[5]);
		
//		Isso guarda os nomes dentro dos vetores. Mas se quiser alterar o nome na posição 6 após o primeiro sysout:
		
//		nomes[5] = "Rafael";
//		System.out.println(nomes[2] + "\n" + nomes[5]);
		
//      Como um vetor de 10 posições vai de 0 a 9, vamos criar um comando for:
		//primeira área é o ponto de partida
		//segunda área é até onde desejo que vá
		//a terceira parte é o incremento
		for (int cont = 0 ; cont < 10 ; cont++) {
			nomes[cont] = Teclado.lerTexto("Informe um nome para arquivar no vetor:");
		}
		
		System.out.println("\n--- Relação de nomes de pessoas ---\n");
		
		for (int cont = 0 ; cont < 10 ; cont++) {
			System.out.println(" " + (cont+1) + " - " + nomes[cont]);
		}
	}

}
