package controller;

import util.Teclado;

/*
 * Desenvolver um programa que pergunte o conteúdo de duas matrizes a e b, cada uma com 5 linhas e 3 colunas,
 * construa uma matriz c de mesma dimensão, 
 * a qual é formada pela soma dos elementos da matriz a com a matriz b.
 * Apresentar ao final o conteúdo das três matrizes.
 */
public class Questao_08 {
	public static void main(String[] args) {
		int a[][]=new int[5][3];
		int b[][]=new int[5][3];
		int c[][]=new int[5][3];
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<3;j++) {
				a[i][j]=Teclado.lerInt("Digite o número para guardar no espaço a" + (i+1) + "." + (j+1) + ":");
			}
		}
		
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<3;j++) {
				b[i][j]=Teclado.lerInt("Digite o número para guardar no espaço b" + (i+1) + "." + (j+1) + ":");
			}
		}
		
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		
		
		
		
		
		System.out.println("### Matriz A ###");
		for (int i=0;i<5;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("### Matriz B ###");
		System.out.println("----------------------");
		for (int i=0;i<5;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("### Matriz C ###");
		System.out.println("----------------------");
		for (int i=0;i<5;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
