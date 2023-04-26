package controller;


public class Questao_13 {
	
	/*
	 * Imprimir a tabuada de 3 a 6
	 */

	public static void main(String[] args) {
		int mult = 3, fat, prod;
		
		
		
		while (mult <= 6 ) {
			fat=0;
			prod = mult*fat;
			
			
			while (fat <= 10) {
				prod = mult*fat;
				System.out.println(fat + " x " + mult + " = " + prod);
				fat++;	
			}
			
			
			mult++;
		}
				
	}

}
