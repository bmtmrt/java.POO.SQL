package model;

public class Carro {
	//	Vamos alterar de público para privado, como no POO07:
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	
	/*
	 * O professor vai ensinar um macete para automatizar isso aqui:
	 * 1º você deixa o cursor logo abaixo da última variável
	 * 2º Vai em Source
	 * 3º Vai em Generate Constructor Using Fields...
	 */
	
	//Método construtor Simples:
	public Carro() {
		super();
		//	Super(); é o comando que cria o objeto. Mas como podemos ver, não é necessário.
		//	Esse objeto contrutor vazio possibilita criar novos objetos na classe Cadastro
	}
	//Método construtor completo:
	public Carro (String fabricante, String modelo, String cor, int ano) {
		//	Esse objeto construtor nos permite criar diretamente no objeto:
		//Carro corsa = new Carro ("Chevrolet", "Corsa Wind", "Branco", 2000);
		this.fabricante=fabricante;
		this.modelo=modelo;
		this.cor=cor;
		this.ano=ano;
		//	o parametro "this.atributo" chama o atributo variável lá da classe mãe. 
		
		//	Métodos Getters and Setters:
		
	}
	
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	// Olha que lindo, o próprio Eclipse fez isso tudo aí em cima <3
}
