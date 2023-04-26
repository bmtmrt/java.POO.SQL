package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado {

	public static void main(String[] args) {
		
		double wage, wagefinal;
		
		wage = Teclado.lerDouble("Informe o seu salário: ");
		
		if (wage < 500) {
				wagefinal = wage * 1.15;
				System.out.println("Seu salário era de " + wage + ". Você recebeu um bônus de 15%, então agora é igual a " + wagefinal);
			} else if (1000 >= wage  && wage >= 500) {
				wagefinal = wage * 1.1;
				System.out.println("Seu salário era de " + wage + ". Você recebeu um bônus de 10%, então agora é igual a " + wagefinal);
			} else if (wage > 1000) {
				wagefinal = wage * 1.05;
				System.out.println("Seu salário era de " + wage + ". Você recebeu um bônus de 5%, então agora é igual a " + wagefinal);
			}
	}

}
