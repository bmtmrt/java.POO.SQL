package controller;

import util.Teclado;

public class Questao_12 {
	/*
	 * Desenvolver um programa que peça ao usuário para digitar diversos números
	 * reais, e ao final, exibir o maior e o menor número que foram digitados, além
	 * da média entre TODOS os números digitados pelo usuário. A inserção de números
	 * deve parar quando o usuário digitar o número -1, e este número -1 não deve
	 * ser considerado nem como maior, nem como menor, e nem na contagem da média.
	 */

	public static void main(String[] args) {
		
		//etapas
		//primeira etapa: pedir para digitar diversos numeros reais
		//parar quando digitar -1
		
		double n, small, big, cont=1, sum=0, media;
		
		n=Teclado.lerDouble("informe o número:");
		
		
		small=n;
		big=n;
		sum = sum + n;
		
		
		//fazer o laço pra quando o número for diferente de -1, ou seja, continue perguntando
		//o teste no parenteses é feito antes do funcionamento do laço
		while (n != -1) {
				
				//antes do computador perguntar o próximo número,
				//a variável small deve receber o n digitado anteriormente:
				
			
				if (small>n) {
						small=n; //essa condicional atribui o menor valor a small
				} else if (big<n) {
						big=n; //esse condicional pega o valor mais elevado e atribui ao big
				}
				
				sum = sum + n;
				//preciso que a nova variável n seja colocada após os calculos, mas antes da volta.
				n=Teclado.lerDouble("informe o número: não pode -1");
				
			//a variável contadora precisa continuar contando, mas faremos fora do if, entretanto dentro do laço:
				cont++; //conta a quantidade de voltas, então a média será feita em função dela
		}
		
		//Preciso que a média seja posterior ao laço.
			media = sum/(cont-1);
		//notamos que o cont, mesmo quando atribuído -1, conta como uma volta.
		
		
		if ( small == -1) {
			System.out.println("Cê tem problema?");
		} else {
			System.out.println(small);
			System.out.println(big);
			System.out.println(media);
			System.out.println(cont-1);
		}
		
		
	}

}
