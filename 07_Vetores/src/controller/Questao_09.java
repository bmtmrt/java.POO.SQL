package controller;

import util.Teclado;

public class Questao_09 {
	/*
	 * 	Desenvolver um programa que leia 10 nomes de pessoas e armazene no vetor nomes. Em seguida o programa
	 *	deve informar que enquanto o usuário responder SIM, será pedido que ele digite um nome e o programa
	 *	informará se este nome existe ou não no vetor nomes. Em resumo, o programa deverá fazer o seguinte:
	 *		• Solicitar 10 nomes para preencher o vetor nomes
	 *		• Perguntar se o usuário quer fazer uma pesquisa de nomes no vetor nomes.
	 *		• Se a resposta for SIM, perguntar qual o nome.
	 *		• Informar se o nome existe ou não no vetor nomes.
	 */

	public static void main(String[] args) {
		//Entrada de dados
			//criando o Vetor:
		String name[]=new String[10];
			//Criando a String para pesquisar:
		String want, search;
		int a=0;
			//Perguntando os nomes para armazenar no vetor:
		for (int i=0;i<10;i++) {
			name[i]=Teclado.lerTexto("Digite um nome:");
		}
		
		
		
			//Aqui usamos um do/while na intenção de procurar caso a variável vontade anterior seja positiva
		do {
			want=Teclado.lerTexto("Quer fazer uma pesquisa de nomes? s/n");
			//o if só entrará em ação quando a resposta for positiva
			if (want.equals("s")) {
				search=Teclado.lerTexto("Qual nome deseja procurar?");
				//Agora, como pesquisamos nomes/Strings no vetor?
				//Precisamos criar outro comando for para que o computador caminhe pelo vetor procurando a informação:
				for (int i=0;i<10;i++) {
					//agora criamos uma variável if para podermos pes
					if (search.equals(name[i])) {
						//aqui estamos procurando o nome, quando o nome for achado:
						System.out.println(name[i]+" está alocado na posição " + (i+1) + " do vetor");
						//a variável a que fizemos depois funciona aqui como uma contadora
						a++;
					}
				}
				//Até aqui, tá tudo certo e rodando. Entretanto, o computador me responde para cada posição do vetor
				//Para solucionar isso, vamos fazer uma variável int a lá em cima, que nos mostrará quantas vezes a String foi encontrada
				//A variável inteira a precisará valer 0, pois agirá como uma contadora
				
				if (a==0) {
					System.out.println(search + " não foi encontrado.");
				}
				
				
			}
			//QUASE ACABANDO O CÓDIGO:
			//agora precisamos zerar a variável que nos ajudou a achar o nome para funcionar normalmente na próxima pesquisa
			//caso contrário, se o nome pesquisado não existir a resposta do if (a==0) não será mostrada.
			a=0;
		} while (want.equals("s"));

		System.out.println("Programa encerrado.");
		
		
		
		
	}

}
