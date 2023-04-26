package controller2;

import util.Teclado;

public class Questao_01 {
	/*
	 * 1) Desenvolver um programa que pergunte o valor da conta a ser paga no
	 * restaurante e exiba como resposta o valor com o acréscimo dos 10% da gorjeta
	 * do garçom.
	 */

	public static void main(String[] args) {
		
		double num, numPer, per;
		num=Teclado.lerDouble("Qual o valor a ser pago?");
		
		numPer=num*1.1;
		per=num*0.1;
		
		System.out.println("Se a conta deu " + num + " reais. Somar-se-á ao montante o valor de " + per + " reais. Tornando o montante a ser pago em R$ " + numPer + ".");
		
	}

}
