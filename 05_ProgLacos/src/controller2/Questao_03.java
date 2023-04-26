package controller2;

import util.Teclado;

public class Questao_03 {
//Desenvolver um programa que apresente o total da soma de cinco valores informados pelo usuário.
	public static void main(String[] args) {
		int cont = 1, num, acum = 0;
		
		do {
			num = Teclado.lerInt("Qual o número que você deseja somar?");
			acum += num;
			cont ++;
		} while (cont <= 5);
		
		System.out.println(acum);
	}

}
