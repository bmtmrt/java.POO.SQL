package controller;

import model.Carro;
import model.Funcionario;
import model.Livro;
import model.Produto;
import util.Teclado;

public class Cadastro {

	public static void main(String[] args) {
		Carro corsa = new Carro ("Chevrolet", "Corsa Wind", "Branco", 2000);
		Carro kombi = new Carro ("VW", "Kombi 1.6", "Branca", 1976);
		Carro golf = new Carro (Teclado.lerTexto("Fabricante"), Teclado.lerTexto("modelo"), Teclado.lerTexto("cor"), Teclado.lerInt("Ano"));
		
		Carro etios= new Carro();
		etios.setFabricante("Toyota");
		etios.setAno(2017);
		etios.setCor("Vermelho");
		etios.setModelo("Etios");
		System.out.println("Dados do carro " + etios.getFabricante() + " " + etios.getModelo());
		
//		Carro audi=new Carro();
//		audi.fabricante="Audi";
//		audi.ano=2020;
//		audi.cor="Prata";
//		audi.modelo="A6";
//		
//		Carro opala=new Carro();
//		opala.fabricante="Chevrolet";
//		opala.ano=1988;
//		opala.cor="Lilás";
//		opala.modelo="Opala";
		
		
		Funcionario func1=new Funcionario();
		func1.matricula=14445665;
		func1.nome="José Carlos Araújo, voltei!";
		func1.cpf="22255566680";
		
		
		Funcionario func2=new Funcionario();
		func2.matricula=14445666;
		func2.nome="ANTÔNIOOOO NUNEEES";
		func2.cpf="44458769820";
		
		
		Funcionario func3=new Funcionario();
		func3.matricula=14445667;
		func3.nome="Adalberto Fortunato";
		func3.cpf="45885464755";
		
		Livro b1=new Livro();
		b1.isbn=146;
		b1.nome="Dark Sun, dias de tormenta";
		b1.autor="Um nerdola de rpg";
		b1.editora="Wizards Of The Coast";
		
		Livro b2=new Livro();
		b2.isbn=1444454;
		b2.nome="Livro do Mestre";
		b2.autor="Monte Cook";
		b2.editora="Wizards Of The Coast";
		
		Livro b3=new Livro();
		b3.isbn=146;
		b3.nome="Vampiro, A Máscara";
		b3.autor="Sei lá";
		b3.editora="World Of Darkness";
		
		
		Produto p1=new Produto();
		p1.idProduto=123444;
		p1.nomenclatura="Seilá";
		p1.descricao="É um produto";
		p1.quantidade=2;
		
		Produto p2=new Produto();
		p2.idProduto=444123;
		p2.nomenclatura="Vassoura";
		p2.descricao="Diga onde você vai que eu vou varrendo";
		p2.quantidade=2;
		
		Produto p3=new Produto();
		p3.idProduto=412344;
		p3.nomenclatura="Esponja";
		p3.descricao="É um produto pra sugar água";
		p3.quantidade=20;
		
		
		
		System.out.println();
		
	}

}
