import test.Produto;

public class Principal {

    public static void main(String[] args) {

	Produto produto1 = new Produto("Picanha");
	Produto produto2 = new Produto("Alcatra");

	Produto produto3 = new Produto("Fraudinha", 45);
	Produto produto4 = new Produto();

	

	System.out.printf("Produto1 (nome) : %s | Produto1 (quantidade) : %d", produto1.nome, produto1.quantidadeEstoque);
	System.out.printf("Produto2 (nome) : %s | Produto2 (quantidade) : %d", produto2.nome, produto2.quantidadeEstoque);

	System.out.printf("Produto3 (nome) : %s | Produto3 (quantidade) : %d", produto3.nome, produto3.quantidadeEstoque);

	System.out.printf("Produto4 (nome) : %s | Produto4 (quantidade) : %d", produto4.nome, produto4.quantidadeEstoque);

	System.out.print(produto1.codigo);


    }

	
	

	

}