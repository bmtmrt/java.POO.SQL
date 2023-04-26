package controller;

import util.Teclado;

public class ExemploMultiplaEscolha {
	
	/*
	 * Programa que pergunte o nº de matrícula de um sócio de um clube e exiba o mês de pagamento de anuidade, conforme seguinte tabela:
	 * 
	 * Nº de matrícula - Mês do pagamento
	 *            0    - Janeiro
	 *            1    - Fevereiro
	 *            2    - Março
	 *            3    - Abril
	 *    Outro final  - Maio
	 */

	public static void main(String[] args) {
		//joga uma variável em evidência chamada switch
		//qual a matemática preciso usar?
		//primeiro crio uma variável int matrícula
		int matricula, ultimo;
		//agora perguntarei a matrícula do sócio utilizando o teclado e salvando na variável
		matricula = Teclado.lerInt("Informe o nº de sua matrícula:");
		
		//Será o último dígito quem irá definir, como poderia pegar o último número para fazê-lo? Como faço o eclipse saber o último digito?
		//Se calcularmos o resto da divisão por 10, todas as dezenas, centenas e milhares serão divisíveis por 10, logo a unidade será o resto:
		//Então, para tal iremos criar uma variável de resto de 10 e iremos processar assim:
		ultimo = matricula % 10;
		
		//Então, agora utilizaremos um comando if para poder definir quais ações o computador tomará diante dessa variável último
		//que representa o número da unidade no número da matrícula. Poderíamos trabalhar com ifs e elses, mas o comando switch facilitará:
		
		//É como se eu tivesse dando o comando pro Java: "Foque nessa variável"
		switch (ultimo) {
		//aqui dentro colocaremos casos para essa variável
			case 0:
				System.out.println("Mês de janeiro");
				break;
		//A função do break é de quebrar o parâmetro, sem ele o computador lerá ambos os cases como se fossem parte do comando.
			case 1:
				System.out.println("Mês de fevereiro");
				break;
			case 2:
				System.out.println("Mês de março");
				break;
			case 3:
				System.out.println("Mês de Abril");
				break;
		//Existe um comando padrão chamado default que funcionará da mesma forma que o else nesse comando, ou seja, tudo aquilo que não é
		//explicitado acima, será o default - O Padrão.
			default:
				System.out.println("Mês de Maio");
				break;
		//Switch pode rodar com int e Strings, mas com Double não.
		//Caso queira solucionar questões mais complicadas onde não tenho uma resposta imediata, como no caso de intervalos ou com o uso de 
		//Doubles, usarei o comando if		
				
		
		}
			

	}

}
