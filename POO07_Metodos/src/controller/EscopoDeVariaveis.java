package controller;

public class EscopoDeVariaveis {
	public static int x=1;//Variável global
	//Variáveis locais e globais
	
	
	public static void main(String[] args) {
		int x=5; //Variável local
		System.out.println("x no início de main() e " + x);
		metodoA(); // Chamada do métodoA dentro do Main, tornando-o executável
		metodoB(); // PRECISAMOS CHAMAR OS MÉTODOS
		//Podemos fazer essa chamada de métodos quantas vezes acharmos possível:
		metodoA();//E ele será exposto no console quantas vezes for pedido
		metodoB();
		// Como parte do passo a passo, vamos tirando conclusões...
		metodoB(x);
		metodoB(4);
		int y = 7;
		metodoB(y);
		
	}	//O que concluí até aqui? que o x no início de main() é 5.
	// No fim dessa chave, a variável x é destruída, não é mais 5.
	//Vamos criar um NOVO MÉTODO, que chamaremos de método A
	
	
	public static void metodoA() {
		int x=25; //Variável local
		System.out.println("A variável local x ao entrar no método A é " + x);
		x+=1;
		System.out.println("A variável local x ao sair  no método A é " + x);
	// Quando damos play num projeto, o JAVA lerá o método principal, no caso, o main. Precisamos fazer uma chamada de outro método.
	}//Da mesma forma, no fim dessa chave a variável x sendo 25 não é mais possível..
	//Isso poderia acontecer até mesmo se colocássemos o método A ante do método main
	// Nossa saída estará contida na linha 8 do código, isto é, chamaremos o métodoA de dentro do método main
	//O método main é um gestor, pegará o retorno dos outros métodos divindo em etapas e blocos os outros métodos.
	
	//VAMOS CRIAR AGORA UMA VARIÁVEL GLOBAL static int x=1, mas para tal, vamos fazê-lo antes do método main() - Lá em cima.
	public static void metodoB(){
				
		/* Aqui não criamos uma variável local porque já estamos trabalhando com a global.
		 * Primeiro o método procurará dentro de si a variável que estamos pedindo Se não encontrar dentro de si, irá buscar na
		 * variável global
		 */
		System.out.println("Variável x ao entrar no metodoB é "+ x + " global.");
		x = x*10; //Aqui percebemos que não precisamos mais falar de x porque ele é uma variável global.
		System.out.println("Variável x antes de sair do metodoB é "+x);
	}
	public static void metodoB(int x){
		
		/* Exatamente igual ao anterior. A diferença é que aqui estams ditando os parâmetros dentro do parenteses.
		 * 
		 * SOBRECARGA DE MÉTODO - Temos dois métodos de um mesmo nome, normalmente não funcionaria. Mas a diferença está na assinatura
		 * do método "(int x)".
		 * 
		 * Aqui a variável local está no parênteses. O Parênteses de um método contém o argumento. Ao chamar esse método precisamos
		 * passar para o método um valor inteiro. Uma variável de chamada.
		 * 
		 * O Método A não tem nada no parênteses, logo tudo que deve ser feito está explícito dentro das chaves. Só dispara a ordem.
		 * 
		 * O Novo Método B é chamado, mas temos que lançar um número para ele. Chamamos ele e deixamos que ele guarde dentro de sua própria 
		 * variável x, que agora lhe é local. Apesar de ter sido buscada lá na variável Global.
		 * 
		 * Quando acionamos um método, explicitamos a nossa escolha:
		 * metodoB(); - Aqui estamos pedindo para calcular com aquela variável global anterior
		 * metodoB(x); - Estamos pegando a variável local do main int x=5 e estamos passando para este método.
		 */
		System.out.println("Variável x ao entrar no metodoB é "+ x + " local.");
		x = x*10; //Aqui percebemos que não precisamos mais falar de x porque ele é uma variável global.
		System.out.println("Variável x antes de sair do metodoB é "+x);
	}
	
	//Como aqui utilizamos a variável global, o valor ficará guardado no métodoB(), ou seja,
	//Agora iremos, na segunda volta no método, irá multiplicar por 10 e guardar nele mesmo,
	//Até porque deixa o valor externo. Se o método utilizasse variável local,
	//Sempre será atribuído o valor da variável local, quantas vezes for pedido.
}
