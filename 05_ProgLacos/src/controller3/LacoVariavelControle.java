package controller3;

public class LacoVariavelControle {
	/*
	 * Laços com variáveis de controle é uma estrutura simplificada, laços com estruturas de repetição são muito encontradas na internet
	 * Mas esse laço é o mais fácil de lembrar
	 * 
	 * TEMOS UM COMANDO NOVO: for (...;...;...) São 3 áreas dividas por um ponto e vírgula.
	 * A primeira parte a gente tem o ponto de partida
	 * Na segunda parte, até onde ele vai
	 * Na terceira, como ele vai chegar.
	 * for (int cont=1; cont<=100; cont++ );
	 */
	
	/*
	 * Algoritmo para pedir a leitura de um valor para a variável x, multiplicar
	 * este valor por 3, colocar o valor obtido na variável r, e apresentar o valor
	 * de r, repetindo a sequência cinco vezes.
	 */

	public static void main(String[] args) {
		//Só quero exibir números de 1 a 100
		for (int cont = 1 ; cont <= 100 ; cont++ ) {
			System.out.println(cont); //Essa saída de dado só funciona se for interna ao for ()
		}
		

	}

}
