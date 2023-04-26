package controller;

public class Questao_15 {

	public static void main(String[] args) {

			int cont =0, acum = 1;

			while (cont <= 1500) {
				
				cont = cont + acum; 
				System.out.println(acum);
				System.out.println(cont);
				acum = acum + cont;
				
			}

	}
}
