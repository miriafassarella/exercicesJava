public class PrincipalCompra {

   public static void main(String[] args) {


	 CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

	Produto produto = new Produto();
	produto.nome = "Agua";
	produto.precoUnitario = Double.valueOf(5.2);


	carrinho.adicionarItem(produto, 4);

	System.out.println(produto.precoUnitario);


   }

   

}