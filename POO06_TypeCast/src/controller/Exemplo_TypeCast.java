package controller;

public class Exemplo_TypeCast {
	
	/*
	 * Temos diversos tipos possíveis (byte, int, short, long...)
	 * Java não faz conversão implícita quando um tipo não cabe no outro
	 * A conversão precisa ser explíita. 
	 */
	
	/*
	 * 
	 *	long grande = 890L;// inicialmente c 64 bits
	 * 	int pequeno = (int)(grande); //conversão explícita
	 *	char letra = (char) 87; // Letra 'W'
	 */
	
	public static void main(String[] args) {
		int a = 5, b = 2;
		int c;
		c = a / b;
		System.out.println("Valor de C: " + c);
		// Três variáveis do tipo inteiro.
		// c recebe a dividido por b e depois pedimos para mostrar o valor de C
		// ENTRETANTO, temos um problema. Como a variável é inteira, não conseguimos
		//   obter a resposta correta. 2.5, e não 2.
		
		double d;
		d=a/b;
		System.out.println("Valor de D: " + d);
		// Ué!! Como a reposta pode ser 2.0 quando sabemos que deveria ser 2.5?
		// Aqui temos tipos misturados, calculamos as variáveis inteiras, mas atribuímos
		//   sua resposta à double.
		
		// Sempre que colocamos a variável no início da fórmula, estamos atribuindo o 
		//   valor dela ao double.
		
		//Como solucionaríamos isso?
		
		double e;
		//conversão explícita 
		//         \/
		e=(double) a/b;
		// Aqui comandamos ANTES da atribuição essa conversão explícita. - BERNARDO
		// Seguinte, dividimos A por B, mas estamos pedindo para que o cálculo seja feito em double.
		//   Antes mesmo de calcular. Mas isso só é possível porque salvamos numa
		//   variável que já era double.
		System.out.println("Valor de E: " + e);
		
		// NÃO USE ISSO, O FABRÍCIO NÃO COBRA E É FEIO!
		
		// Conversão implícita é aquela em que não informamos o tipo, 
		
		float f=14.5F; 
		//quando possui nº decimal, precisamos colocar a letra F no fim.
		e=f; //Só peguei o valor de e atribuí a f
		System.out.println("Valor de F: " + f);
		//ORDEM DE CONVERSÃO:
		// byte -> short -> int -> long -> float -> double
			// Apenas podemos fazer dessa forma.
		
		// O Código fica mais bonito, mais claro, quando explicitamos a mudança
		//   que almejamos.
		
	}

}
