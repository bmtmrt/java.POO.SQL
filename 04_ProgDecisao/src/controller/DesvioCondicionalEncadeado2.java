package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado2 {

	public static void main(String[] args) {
		
		double wage, raise, wageFinal;
		
		wage = Teclado.lerDouble("Informe o seu salário: ");
		
		
		if (wage < 500) {
				raise = wage * 15/100;
				wageFinal = wage + raise;
				System.out.println("Seu salário era de R$" + wage + ". Você recebeu um bônus de 15% (R$ " + raise + "), então agora é igual a R$ " + wageFinal);
			} else if (1000 >= wage  && wage >= 500) {
				raise = wage * 10/100;
				wageFinal = wage + raise;
				System.out.println("Seu salário era de R$" + wage + ". Você recebeu um bônus de 10% (R$ " + raise + "), então agora é igual a R$ " + wageFinal);
			} else if (wage > 1000) {
				raise = wage * 5/100;
				wageFinal = wage + raise;
				System.out.println("Seu salário era de R$" + wage + ". Você recebeu um bônus de 5% (R$ " + raise + "), então agora é igual a R$ " + wageFinal);
			}

	}

}
