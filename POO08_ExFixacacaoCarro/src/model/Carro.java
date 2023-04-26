package model;

public class Carro {
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;
	
	//método contrutor simples
	public Carro() {
		super();
	}
	
	//método construtor Completo
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	}

	//método get set
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	//Segundo Slide do PSCPOO0.5ExerceciodeFixacaoMetodosCarro
	
	
	//Agora estamos criando uma sobrecarga de métodos, solucionando
	//Método Construtor Personalizado:
	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false;
		this.velocidade = 0;		
	}
	
	
	//Implementação do método detalhes():
	public void detalhes() {
		System.out.println("Modelo: " + this.getModelo()); // Uusando this.atributoObjeto 
		System.out.println("Fabricante: " + getFabricante()); // Usando o método get
		System.out.println("Ano: " + ano); // Prática feia
//		System.out.println(this.situacaoMotor() + "\n"); //QUE LINDEZA! <3  - Não faz parte do trabalho
	}
	
	
	//O Método situacaoMotor, não é void, é String. LOGO, precisa que haja retorno:
	public String situacaoMotor() { //Poderia colocar no if (ismotorLigado())
		if (this.motorLigado == true) { // poderia ser (this.motorLigado) por ser boolean presume-se verdade
			return this.modelo + " --> MOTOR LIGADO";
		} else { //poderiamos usar else if (!this.motorLigado)
			return this.modelo + " --> Motor desligado";
		}
	}
	
	
}
