import java.util.Arrays;
import java.util.ArrayList;

public class Cardapio {

  ArrayList<ItemCardapio> itens = new ArrayList();

    void adicionarItem(ItemCardapio item) {
        this.itens.add(item);
    }

    void removerItem(int indice) {
        this.itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

}