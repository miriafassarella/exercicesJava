import java.util.Scanner;

public class PiramideInvertida {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.print("Digite um número inteiro positivo: ");
	int numero = entrada.nextInt();
	String espaco = "";

	for (int i = numero; i > 0; i--) {
		espaco += " "; 
		}
		
	


	for (int i = 1; i <= numero; i++) {

		System.out.println();
		System.out.print(espaco);
		
		for (int j = 1; j <= i; j++) {
			
			System.out.print("*");
			
		}

		i++;		
		
		

		
		
		espaco = espaco.substring(0, espaco.length() - 1);
	}

    }
}