import java.util.Scanner;

public class ApostaMegaSena {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	int quantidadeNumeros = 0;

	
	do {
	    System.out.print("Quantidade de números: ");
	    quantidadeNumeros = entrada.nextInt();

	

	} while (quantidadeNumeros < 6 || quantidadeNumeros > 15);


	int numeroAtual = 1;

	String numerosEscolhidos = "";
	

	do {
	     System.out.printf("Número %d/%d: ", numeroAtual, quantidadeNumeros);
	     int numeroEscolhido = entrada.nextInt();

		if (numeroEscolhido < 0 || numeroEscolhido > 60) {
			System.out.println("Número deve ser de 1 a 60");

		}else {
			numerosEscolhidos += numeroEscolhido + " ";
			numeroAtual++;
		}
	     	
	}while (numeroAtual <= quantidadeNumeros);

System.out.printf("Númros escolhidos: %s%n", numerosEscolhidos);
    }




}