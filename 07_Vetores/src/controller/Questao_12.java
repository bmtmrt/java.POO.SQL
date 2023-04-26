package controller;

import util.Teclado;

public class Questao_12 {
	/*
	 * Crie dois vetores a e b com 5 elementos cada e preencha-os com números
	 * informados pelo usuário. Ao final apresente os números que existem repetidos
	 * entre os 2 vetores.
	 */

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		
		
		//Entrada de dados:
		for ( int i=0;i<5;i++) {
			a[i]=Teclado.lerInt("Informe um número para o " + (i+1) + "º espaço do vetor a:");
		}
		for ( int j=0;j<5;j++) {
			b[j]=Teclado.lerInt("Informe um número para o " + (j+1) + "º espaço do vetor b:");
		}
		//Fim da Entrada de Dados
		
		
		//Aqui está a saída de dados dos vetores, meramente:
		for ( int i=0;i<5;i++) {
			System.out.print("| " + a[i] + " |");
		}
		System.out.println();
		for ( int j=0;j<5;j++) {
			System.out.print("| " + b[j] + " |");
		}
		System.out.println();
		System.out.println("Os números iguais são:");
		/* Para podermos descobrir quais números dos vetores são iguais, precisamos...
		 * Bem, primeiramente precisamos fazer um looping dentro do outro, como se tivéssemos tratando de matrizes.
		 * A função do loop interno é checar cada número do vetor b comparando com o loop externo que será do vetor a:
		 */
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (a[i]==b[j]) {
					System.out.print("| " + a[i] + " |");
				}
			}
		}
	}

}
