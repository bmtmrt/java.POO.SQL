package controller2;

import util.Teclado;

public class Questao_02 {
	/*
	 * 2) Desenvolver um programa que faça duas perguntas: o valor referente às
	 * horas atuais e o valor referente aos minutos atuais. 
	 * 
	 * Exemplo, se agora são 09:35h o usuário deverá informar como resposta às horas atuais o valor 09 e
	 * como resposta aos minutos atuais o valor 35. 
	 * 
	 * Em seguida o programa deverá apresentar como resposta quantos minutos já se passaram desde às 00:00h deste
	 * dia
	 */

	public static void main(String[] args) {
		int hour, minute, minuteTotal;
		hour=Teclado.lerInt("Digite que horas são:");
		minute=Teclado.lerInt("Quantos minutos?");
		
		minuteTotal = ( hour * 60 ) + minute;
		
		System.out.println("Já se passaram " + minuteTotal + " minutos desde meia noite.");

	}

}
