public class PrincipalCardapio {

    public static void main(String[] args) {

	Cardapio cardapio = new Cardapio();

        ItemCardapio item1 = new ItemCardapio();
        item1.descricao = "Rib Eye 500g";
        item1.preco = 95;

	cardapio.adicionarItem(item1);
	

    }
}