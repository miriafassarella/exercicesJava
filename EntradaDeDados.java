import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite seu nome: ");

	String nome = entrada.nextLine();

	System.out.printf("Oi, %s", nome);

    }


}