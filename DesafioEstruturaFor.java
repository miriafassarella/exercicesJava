import java.util.Scanner;

public class DesafioEstruturaFor {


	public static void main(String[] args) {
	
	    Scanner entrada = new Scanner(System.in);

	int somaDosNumerosdigitados = 0;

	for (int i = 1; i <= 10; i++) {

	System.out.print("Digite o número " + i + " : ");
	int numeroDigitado = entrada.nextInt();

	if(numeroDigitado % 2 == 0) {

	somaDosNumerosdigitados += numeroDigitado;
	}else {
		System.out.println("O número que foi digitado não é um número par, digite um número par !");
		i--;
	
		continue;
	}
	}
	System.out.printf("A soma dos números digitados é: %d%n", somaDosNumerosdigitados);

	}


}