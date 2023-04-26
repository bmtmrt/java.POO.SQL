package controller;

public class Questao_15_Cola {

	public static void main(String[] args) {

			int pos = 1, ant = 1, aux = 0, cont = 1;
			do {
				System.out.println(ant);
				//a var auxiliar receberá pos+ant
				aux = ant+pos;
				ant = pos; //o número anterior receberá o posterior
				pos = aux; //o número posterior receberá o montante anterior.
				cont ++;
			} while (cont <= 15);
			
			//até chegar na contagem de 15. Os números serão recebidos e alterados de modo que somem entre si.
			

	}
}
