package controller2;

import util.Teclado;

public class Questao_10 {
	/*
	 * A série de Ricci difere da série de Fibonacci porque os dois primeiros termos
	 * são fornecidos pelo usuário. O restante da série é calculado da mesma forma
	 * que na série de Fibonacci. Altere o programa da questão anterior, para que
	 * sejam perguntados os dois primeiros termos da série de Ricci, e sejam
	 * exibidos os 15 termos subsequentes desta série.
	 */

	public static void main(String[] args) {
		int n1, n2, cont=1;
			n1=Teclado.lerInt("qual o primeiro nº?");
			n2=Teclado.lerInt("qual o segundo nº?");
				do {
					n1+=n2;
					n2+=n1;
					System.out.println(n1);
					System.out.println(n2);
					cont++;
				} while (cont<=15);

	}

}
