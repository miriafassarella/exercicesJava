import java.util.Arrays;

public class Cardapio {

 ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
	this.itens = Arrays.copyOf(this.itens, itens.length + 1);
	this.itens[itens.length - 1] = item;
        
    }

    void removerItem(int indice) {
        // TODO implementar exclusão de item do cardápio da posição informada
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {


	for (int i = 0; i < itens.length; i++) {
	
		if (itens[i] != null) {
		     System.out.printf("O item com a seguinte descrição:  %s custa %.2f !%n", itens[i].descricao, itens[i].preco);

		}
	
	  


	}
        // TODO implementar código para imprimir na console os itens
        //  do cardápio que estiverem entre o preço mínimo e máximo
    }


}