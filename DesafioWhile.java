import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	int numero = 0;
	

	int resultado = 0;

	while (numero < 100) {
	    System.out.println("Digite um número inteiro: ");
	    numero = entrada.nextInt();

	     resultado += numero;

	     if (resultado >= 100) {

		System.out.printf("A soma dos números digitados é: %d%n", resultado);
		break;
	      }

	    
	}


    }




}