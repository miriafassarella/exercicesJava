public class PrincipalCompra {

   public static void main(String[] args) {


	 CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

	Produto produto = new Produto();
	produto.nome = "Agua";
	produto.precoUnitario = Double.valueOf(5.2);

	Double valorTotal = Double.valueOf(4.3);
	Integer converteD = Integer.valueOf(valorTotal.intValue());

	//convertendo um int para um short
	//short convertShort = converteD.shortValue();
	Short convertShort = Short.valueOf(converteD.shortValue());
	
	Integer entregaDias = 30;
	Double novoD = 4.6; //a partir do java 5.

	int novoInt = 5;
	Integer outroInt = novoInt;

	Short novoShort = Short.valueOf(outroInt.shortValue());


	int numero = 7;
	Integer novoNumero = Integer.valueOf(numero);

	Double novoDouble = Double.valueOf(novoNumero.doubleValue());

	short desembrulhaShort = novoDouble.shortValue();

	Short embrulhaShort = Short.valueOf(desembrulhaShort);

	short shortDesembrulhado = embrulhaShort.shortValue();
	int numeroPronto = (int) shortDesembrulhado;

	carrinho.adicionarItem(produto, 4);

	System.out.println(numeroPronto);



   }

   

}