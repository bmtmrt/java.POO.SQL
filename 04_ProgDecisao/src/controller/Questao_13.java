package controller;

import util.Teclado;

public class Questao_13 {

	/*
	 * Desenvolver um programa que pergunte 3 valores (variáveis a, b e c) e ao
	 * final apresente-os dispostos em ordem crescente.
	 * 
	 */

	public static void main(String[] args) {
		
		//Entrada de dados:
		
		int a, b, c, aux;
		a = Teclado.lerInt("Digite seu primeiro número");
		b = Teclado.lerInt("Digite seu segundo número");
		c = Teclado.lerInt("Digite seu terceiro número");
		/*
		 * Mais fácil do que mudar a ordem das variáveis é mudar os valores atribuídos a elas;
		 * Por conta disso, criamos uma variável auxiliar;
		 * Então na daída dos dados a disposição de variáveis será a<b<c;
		 */
		
		
		
		
		//Processamento de dados:
		
		//1 - a var a NECESSITA ser a menor sempre, logo:
		if (a > b) {
			aux = a; //atribuo o valor de a à aux, para guardar essa informação;
			a = b; //após isso, atribuo à variável a o valor dentro da var b;
			b = aux; //por fim, pego o backup da var a que estava guardada na var aux e atribuo à var b.
		}
		//2 - a var a também deve ser sempre menor que c, então repetimos esse algorítmo:
		
		if (a > c) {
			aux = a; //1 - guardo o valor de a na var auxiliar;
			a = c; //2 - guardo o valor da var c à var a;
			c = aux; //3 - por fim, atribuo o valor de a guardado na var auxiliar à var c.
		}
		//Agora, após esses códigos, a sempre será a menor variável. Entretanto, as posteriores serão organizadas como?
		
		//3 - a var b não pode ser maior que a c, visto que queremos que a disposição de saída dos dados seja a, b, c:
		
		if (b > c) {
			aux = b; //1 - seguindo a linha de raciocínio, guardamos o valor de b na auxiliar;
			b = c; //2- Após isso guardamos o valor de c na var b;
			c = aux; //3 - por fim, voltamos ao valor de b guardado na var auxiliar e atribuiremos à var c.
		}
		
		//Agora o sistema compreende que a var a deve ser menor que b e c, bem como b deve ser menor que c.
		
		//Saída de dados:
		
		System.out.println("Os números digitados, quando colocados na ordem crescente, serão: " + a + ", " + b + ", " + c + ".");
	}
}


//Lembrando que esse esquema funciona devido ao fato da leitura acontecer sempre de cima para baixo. Então utilizamos tal lógica quando pretendemos guardar valores em variáveis
