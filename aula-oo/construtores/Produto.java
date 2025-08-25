public class Produto {

     static final int QUANTIDADE_ESTOQUE_INICIAL = 100;
	
     String nome;
     int quantidadeEstoque;

     Produto(String nome) {
	System.out.println("Eu sou um contrutor da classe Produto");

	this.nome = nome;
	this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

	

}