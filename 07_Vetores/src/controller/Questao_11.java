package controller;

import util.Teclado;

public class Questao_11 {
	/*
	 * Crie um vetor a com 10 elementos e pergunte ao usuário 10 números para
	 * preencher este vetor. Ao final, apresente o maior e o menor valor informados,
	 * além da média dos 10 números informados
	 */

	public static void main(String[] args) {
		int a[]=new int[10];
		int h=0, l=1, cont=0;
		
		for(int i=0;i<10;i++) {
			
			a[i]=Teclado.lerInt("Digite um número:");
			cont=cont+a[i];
			
			if (a[i]>h) {
				h=a[i];
			} else if (a[i]<h) {
				l=a[i];
			}
		}
		
		System.out.println("O maior número é " + h + " e o menor número é " + l);
		System.out.println(cont/10);
			
	}

}


