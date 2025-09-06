class Produto {

    String nome;
    private double preco;

    public void imprimir() {

	System.out.print(this.nome);
    }

}

public class Fornecedor {
    
	public static void main(String[] args) {

	    Produto produto = new Produto();
	    produto.nome = "Cortador de gramas";

	    produto.imprimir();

	}

    }