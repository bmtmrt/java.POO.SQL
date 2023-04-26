package controller;

import util.Teclado;

public class LacoTesteInicio_02 {

	/*
	 * Algoritmo para pedir a leitura de um valor para a variável x, multiplicar
	 * este valor por 3, colocar o valor obtido na variável r, e apresentar o valor
	 * de r, repetindo a sequência cinco vezes.
	 */

	public static void main(String[] args) {

		int x, r, cont;
		
		cont = 1;
		while ( cont <= 5 ) {
			x = Teclado.lerInt("Digite aqui seu número:");
			r = x * 3;
			System.out.println(x + " multiplicado por 3 é igual a " + r);
			//Ação de incremento do contador:
			cont = cont + 1;
		}
		
		//comando while, enquanto. Enquanto o teste fizer o esperado, o comando será dado;
		// preciso repetir 5 vezes, para isso preciso fazer uma variável para o tal, nesse caso chamamos de contador;
		//Nesse caso em específico, estamos fazendo a contagem de vezes utilizando a variavel contador. Se menor ou igual a 5, se repetirá até completar
		//essa contagem.
		
		//Primeiro eu crio a variável e atribuo o valor de 1 a ela. É a primeira coisa que deve ser feita.
		//Após isso, utilizaremos o comando while para dizer que tudo aquilo contido será repetido até completar 5 vezes.
		//imediatamente antes de fechar a chave do comando while, nós mandamos o contador receber ele mesmo + 1, na intenção de completar a contagem
		//até 5. OU seja, alteramos o valor da variável contador logo após a resolução da mesma. Isso é feito dentro do próprio comando.
	}

}
