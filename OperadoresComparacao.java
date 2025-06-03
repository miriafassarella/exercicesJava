public class OperadoresComparacao {

    public static void main (String[] args) {

	int pesoprodutos = 900;
	int limitePesoCaminhao = 1000;


	boolean cargaExedida = pesoprodutos > limitePesoCaminhao;
	System.out.printf("Carga expedida: %b%n", cargaExedida);


	//boolean cargaLiberada = pesoprodutos < limitePesoCaminhao;

	//boolean cargaLiberada = pesoprodutos <= limitePesoCaminhao;

	boolean cargaLiberada = limitePesoCaminhao >= pesoprodutos;

	System.out.printf("Carga liberada: %b%n", cargaLiberada);
	

    }


}