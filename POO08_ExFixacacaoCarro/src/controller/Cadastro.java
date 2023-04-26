package controller;
// ctrl + shift + O - IMPORTA
import model.Carro;

public class Cadastro {
	public static void main(String[] args) {
		//	Instanciando objeto pelo método construtor simples:
		Carro uno = new Carro();
		uno.setFabricante("Fiat");
		uno.setModelo("Uno Mille 1.0");
		uno.setAno(2010);
		uno.setMotorLigado(true); //Variáveis boolean são Set/is, diferente do Get/Set dos outros.
		uno.setVelocidade(0);
		
		//	Agora vamos usar o construtor completo:
		Carro gol = new Carro("VW", "Gol Turbo", 2018, true, 70);
//		System.out.println("Modelo: " + gol.getModelo());
//		System.out.println("Ano: " + gol.getAno());
//		System.out.println("Fabricante: " + gol.getFabricante());
//		System.out.println("Motor Ligado? " + gol.isMotorLigado());
//		System.out.println("Velocidade: " + gol.getVelocidade());
		//FIM DO SLIDE 1 PSCPOO0.5ExerceciodeFixacaoMetodosCarro
		
		//Vamos utilizar o método Construtor Personalizado:
		Carro ka = new Carro ("Ford", "Ka", 2020);
//		System.out.println("Modelo: " + ka.getModelo());
//		System.out.println("Ano: " + ka.getAno());
//		System.out.println("Fabricante: " + ka.getFabricante());
//		System.out.println("Motor Ligado? " + ka.isMotorLigado());
//		System.out.println("Velocidade: " + ka.getVelocidade());
		
		ka.detalhes();
		System.out.println(ka.situacaoMotor());
		uno.detalhes();
		//uno.situacaoMotor(); Isso aqui não aparece no console. Precisamos usar sysout:
		String texto = uno.situacaoMotor();
		System.out.println(texto);
		gol.detalhes();
		System.out.println(gol.situacaoMotor());
		
	}

}
