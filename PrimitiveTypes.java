public class PrimitiveTypes {
    public static void main(String[] args){

        boolean compraAprovada = true;
        boolean clienteBloqueado = false;

	int quantidadeEstoque = 10;
	int quantidadePedidoCompra = 9;

	boolean stoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;
	System.out.println("EstoqueSuficiente: " + stoqueSuficiente);


	char inicialDoNome = 'M'; //nao compila, não pode ser com aspas duplas e só funciona com um caracter.

	byte idade = 127; //valor maximo.
	//byte idade2 = 128; //não compila

	short qEstoque = 32767; // valor maximo.
	//short quantidadeEstoque2 = 32768; // não compila.
    }


}