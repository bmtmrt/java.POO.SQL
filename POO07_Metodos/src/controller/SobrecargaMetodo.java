package controller;

public class SobrecargaMetodo {
	// variáveis globais
	public int idade;
	public String nome;
	//	Void é aquele método que não precisa retornar um valor
	//	Public diz que ele é público
	//	Static é assunto futuro.
	public static void main(String[] args) {
		//	Aqui vamos instanciar o objeto scm da classe SobrecargaMetodo:
		SobrecargaMetodo scm = new SobrecargaMetodo();
		//	Sempre que isntanciarmos um objeto, ele herdará métodos e atributos da classe:
		scm.cadastrarPessoa(58); //	Colocar um valor inteiro chama o primeiro cadastrarPessoa(int valor);
		scm.cadastrarPessoa("Jorge Nogueira"); //	Colocar uma String chama o segundo, o cadastrarPessoa(String valor);
		scm.cadastrarPessoa(35, "Fabricio Curvello"); //	Por fim, chamamos o terceiro por meio desta assinatura. 
													  //   CadastrarPessoa(int valor1; String valor2);
		scm.cadastrarPessoa(32, "Bernardo");		  //	Mais um exemplo para testar o método, se quisesse inverter os valores
													  //   precisaria criar um método para cadastrarPessoa (String valor1, int valor2); 
	}
	//	Aqui estamos determinando a declaração de um número inteiro - (32) 
	public void cadastrarPessoa(int valor) {
		idade = valor;
		System.out.println("Idade: " + idade);
	}
	//	Aqui precisamos declarar uma variável string - ("Bernardo")
	public void cadastrarPessoa(String valor) {
		nome = valor;
		System.out.println("Nome: " + nome);
	}
	// Aqui quero dizer que precisaremos passar dois parâmetros quando declararmos. - (Primeiro o valor inteiro 32, depois a string "Bernardo")
	public void cadastrarPessoa(int valor1, String valor2) {
		idade = valor1;
		nome = valor2;
		System.out.println("Idade: " + idade + " - Nome: " + nome);
	}
}
