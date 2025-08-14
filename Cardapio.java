import java.util.Arrays;

public class Cardapio {

 ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
	this.itens = Arrays.copyOf(this.itens, itens.length + 1);
	this.itens[itens.length - 1] = item;
        
    }

    void removerItem(int indice) {
	ItemCardapio[] itensNovos = new ItemCardapio[this.itens.length - 1];
        System.arraycopy(this.itens, 0, itensNovos, 0, indice);
	System.arraycopy(this.itens, indice + 1, itensNovos, indice, this.itens.length - (indice + 1));

	this.itens = itensNovos;

	
	}

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {


	for (int i = 0; i < itens.length; i++) {
	
		if (itens[i] != null && itens[i].preco > precoMinimo && itens[i].preco < precoMaximo) {
		     System.out.printf("Descrição:  %s | Preço: %.2f !%n", itens[i].descricao, itens[i].preco);

		}
	
	  


	}
        // TODO implementar código para imprimir na console os itens
        //  do cardápio que estiverem entre o preço mínimo e máximo
    }


}