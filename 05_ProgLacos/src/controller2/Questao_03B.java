package controller2;

public class Questao_03B {
//Desenvolver um programa que apresente o total da soma dos cinco primeiros números inteiros.
	public static void main(String[] args) {
		int cont = 1, acum = 0;
		do {
			acum += cont;
			cont ++;
		} while (cont <= 5);
		System.out.println("A soma dos 5 primeiros números é " + acum);
	}

}
