import java.util.Scanner;


public class Desafio4 {

    public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);

	System.out.print("Digite um número inteiro: ");
	int numero = entrada.nextInt();

	System.out.print("Digitos: ");
	while (numero > 0) {

	int digito = numero % 10;
	System.out.print(" " + digito);
	numero = numero / 10;
	}
	
	System.out.println();

    }
}