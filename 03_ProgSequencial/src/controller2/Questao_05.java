package controller2;

import util.Teclado;

public class Questao_05 {
	/*
	 * Fazer um algoritmo que pergunte o nome de um vendedor, o seu salário fixo e o
	 * total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
	 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, exibir ao final o
	 * seu nome, o salário fixo, a comissão e o salário completo (fixo + comissão
	 * sobre vendas) no final do mês.
	 */

	public static void main(String[] args) {
		String nome;
		double salFix, vendaR$, salTotal;
		
		nome = Teclado.lerTexto("Qual o nome do vendedor?");
		salFix = Teclado.lerDouble("Qual o salário do vendedor?");
		vendaR$ = Teclado.lerDouble("Qual o montante total vendido por ele nesse mês?");
		
		salTotal = salFix + (vendaR$ * 0.15);
		
		System.out.println("o vendedor " + nome + " receberá um adicional de " + vendaR$*0.15 + " nesse mês, totalizando o salário final de R$ " + salTotal);

	}

}
