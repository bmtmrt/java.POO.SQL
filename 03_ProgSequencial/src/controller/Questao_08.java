package controller;

import util.Teclado;

public class Questao_08 {

	/*
	 * Fazer um programa que calcule e apresente a quantidade de litros que um
	 * automóvel gastará em uma viagem. O programa deve coletar as seguintes
	 * informações: Distância a percorrer na viagem, em quilômetros; qual é o valor
	 * do consumo médio do automóvel, em quilômetros por litro.
	 */

	public static void main(String[] args) {
		double lBase, km, lConKm;
		
		km = Teclado.lerDouble("Digite qual a distância a percorrer na viagem:");
		lBase=Teclado.lerDouble("Qual o valor a do consumo médio do carro em km/l?");
		
		lConKm=km/lBase;
		
		System.out.println("Percorrer " + km + " km no seu carro, que gasta " +lBase+ " km/l, consome " + lConKm + " km/l." );

	}

}
