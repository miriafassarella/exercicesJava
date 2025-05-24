public class OperadorIncremento {

    public static void main(String[] args) {
    
        int totalDownloads = 10;
	
	//Aqui ele atribui primeiro para depois incrementar.
	//int novoTotalDownloads = totalDownloads++;

	//Aqui ele incrementa primeiro para depois atribuir.
	int novoTotalDownloads = ++totalDownloads;
	
	int decremento = 10;
	//Aqui ele dcrementa para depois atribuir.
	int novoValorDecremento = --decremento;
	
	System.out.println("Total de downloads: " + novoTotalDownloads);
	System.out.println("Valor decremento: " + novoValorDecremento);

    }

}

