package controller;

public class VisibilidadeDeAtributosEMetodos {
	
	public static void main(String[] args) {
		/*
		 *  Métodos públicos são aqueles visíveis externamente, outras classes podem acessá-los.
		 *  
		 *  Atributos de Classes de Negócios são aqueles que possuem visibilidade privada.
		 * 	Aquilo que é PRIVADO só pode ser acessado pela mesma classe.
		 * 
		 * 
		 * MODIFICADORES - QUEM PODE ACESSAR:
		 * private - Acessado pela mesma classe, apenas.
		 * <package> - Pela mesma classe e pelo mesmo pacote.
		 * protected - Pela mesma classe, mesmo pacote e por subclasses.
		 * public - Por qualquer Lugar.
		 * 
		 * Método void significa que ele é "sem retorno".
		 * ex.: Temos o Rafael, visível para todos, avisamos a ele que estamos devendo um dinheiro para alguém,
		 * deixamos o dinheiro com o Rafael e acreditamos que este entregará à pessoa, é sem retorno de resposta.
		 * Apenas cremos que o que será pedido será feito.
		 * 
		 * Um método que não é void como, por exemplo, "public String receberPagamento(){};" haverá um retorno.
		 * Se fosse int, seria um número inteiro. Se fosse double, um racional. Se fosse um objeto, retornaria o objeto.
		 * 	Para tal, precisamos utilizar o comando "return", no caso de exemplo seria assim:
		 * 		public String receberPagamento () {
		 * 			return "O que desejo que seja devolvido";
		 * 	}
		 * public String receberPagamento () {
		 * 			return this.aquiloQueDesejoQueSejaRetornado;
		 * 	}
		 * 
		 * Na hora que precisarmos acessar esse método por fora da classe, iremos utilizar:
		 *	Fazemos isso para manter segurança de informação.
		 *
		 *			pagamento.receberPagamento();
		 *
		 *
		 * TUDO ISSO FALADO PODE SER AUTOMATIZADO, porque já existe um padrão de mercado para tal:
		 * Encapsulamento - Manter dentro da classe seus métodos e propriedades; Facilita a manutenção.
		 * Ocultamento - Modifica a visibilidade de atributos e métodos de acordo com os modificadores.
		 * 
		 * Fazemos isso por meio dos métodos get e set:
		 * Método Get: Retorno do dado que está no atributo da classe.
		 * Método Set: Entrada de dados no atributo da classe.
		 * 
		 * Atributos em cima, métodos depois. - 
		 * Contrutores ANTES dos métodos Get e Set. - Como o Fabrício prefere.
		 * 
		 * O professor vai ensinar um macete para automatizar isso aqui:
		 * 1º você deixa o cursor Onde quiser
		 * 2º Vai em Source
		 * 3º Vai em Generate Getters and Setters...
		 * 4º Podemos fazer como desejarmos, tudo ou nada, só gets ou sets...
		 * 
		 * Usamos o método set.blaBlaBla para fazermos entrada de dados
		 * No caso o get.blaBlaBla() quando queremos apenas o retorno daquele objeto guardado no set.blaBlaBla()
		 * 
		 * 
		 */
		

	}

}
