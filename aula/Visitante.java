public class Visitante {

    static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 18;

    String nome;
    int idade;




   public boolean visitanteMaiorDeIdade() {

	return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;

    } 

}