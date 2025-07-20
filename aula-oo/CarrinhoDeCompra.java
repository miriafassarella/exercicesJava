import java.util.Objects;

public class CarrinhoDeCompra {

    int quantidadeItens;
    Produto produto;

   public void adicionarItem(Produto produto, int quantidade) {

	Objects.requireNonNull(produto, "Produto deve ser informado");

	if (quantidade <= 0) {
	    throw new IllegalArgumentException("Quantidade deve ser maior que 0");
	}

    }
}