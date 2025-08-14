import java.util.Arrays;
import java.util.ArrayList;

public class Cardapio {

 ArrayList<ItemCardapio> itens = new ArrayList();

    void adicionarItem(ItemCardapio item) {
	
	itens.add(item);
	
	/*this.itens = Arrays.copyOf(this.itens, itens.length + 1);
	this.itens[itens.length - 1] = item;*/
        
    }

    void removerItem(int indice) {

	itens.remove(indice);

	/*ItemCardapio[] itensNovos = new ItemCardapio[this.itens.length - 1];
        System.arraycopy(this.itens, 0, itensNovos, 0, indice);
	System.arraycopy(this.itens, indice + 1, itensNovos, indice, this.itens.length - (indice + 1));

	this.itens = itensNovos;*/

	
	}

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {


	for (int i = 0; i < itens.size(); i++) {
	
		if (itens.get(i) != null && itens.get(i).preco > precoMinimo && itens.get(i).preco < precoMaximo) {
		     System.out.printf("Descrição:  %s | Preço: %.2f !%n", itens.get(i).descricao, itens.get(i).preco);

		}
	
	  


	}
        // TODO implementar código para imprimir na console os itens
        //  do cardápio que estiverem entre o preço mínimo e máximo
    }


}