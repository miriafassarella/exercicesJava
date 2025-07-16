public class Produto {

    static double custoEmbalagem;

//tornando o método statico
    static void alterarCustoEmbalagem(double custoEmbalagem) {
	
	Produto.custoEmbalagem = custoEmbalagem;
//ao invez de usar o this, usamos o nome da classe para referenciar uma variável statica.


    }
}