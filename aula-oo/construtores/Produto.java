public class Produto {

     static final int QUANTIDADE_ESTOQUE_INICIAL = 100;
	
     String nome;
     int quantidadeEstoque;

     Produto() {

	this.nome = "Sem nome";
	this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;

     }

     Produto(String nome, int quantidadeEstoque) {
	this.nome = nome;
	this.quantidadeEstoque = quantidadeEstoque;

     }

     Produto(String nome) {
	System.out.println("Eu sou um contrutor da classe Produto");

	this.nome = nome;
	this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

	

}