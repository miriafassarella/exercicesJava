public class Cardapio {

    ItemCardapio[] itens;;

    public void adicionarItem(ItemCardapio item) {
	 // TODO implementar inclusão de item do cardápio

	if (item == null) {
	    throw new RuntimeException("O parametro no método adicionarItem não pode ser null");
	}

	this.itens.add(item);

    }

    public void removerItem() {
	 // TODO implementar inclusão de item do cardápio

    }

    public void ImprimirItensCardapio() {
	 // TODO implementar código para imprimir na console os itens
        //  do cardápio que estiverem entre o preço mínimo e máximo

    }


}