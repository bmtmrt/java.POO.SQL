package controller;

import util.Teclado;

public class Questao_10 {
	/*
	 * Crie 3 vetores (nomes, telefones, endereços) e pergunte ao usuário o nome,
	 * telefone e endereço de 5 pessoas. Em seguida peça ao usuário para digitar um
	 * número de 1 a 5, e exibir como resposta os dados da pessoa cadastrada no
	 * número informado.
	 */

	public static void main(String[] args) {
		String name[] = new String[5];
		String address[] = new String[5];
		int tel[] = new int[5];
		int n;
		
		for (int i=0;i<5;i++) {
			name[i]=Teclado.lerTexto("Qual o nome da pessoa?");
			address[i]=Teclado.lerTexto("Qual o endereço dela?");
			tel[i]=Teclado.lerInt("Qual o telefone dela?");
			n=(i+1);
		}
		
		n=Teclado.lerInt("Qual o número do vetor que deseja ver a pessoa?");
		System.out.println("### RESULTADO DA PESQUISA ###");
		System.out.println("Nome: " + name[(n-1)] + "\nEndereço: " + address[(n-1)]+ "\nTelefone: " + tel[(n-1)]);

	}

}
