
import java.util.Scanner;

public class DesafioEstruturaForIntermediario {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	for (;;) {
	   System.out.print("Digite um número primo: ");
	   int numeroDigitado = entrada.nextInt();

	  if (numeroDigitado % 2 == 0 && numeroDigitado != 2) {
		System.out.println("O número digitado não é um número primo.");
		continue;
	   }else if (numeroDigitado % 3 == 0 && numeroDigitado != 3) {
		
		System.out.println("O número digitado não é um número primo.");
		continue;
	   }else if (numeroDigitado == 1) {

		System.out.println("O número digitado não é um número primo.");
		continue;
		}

		System.out.printf("Parabéns, o número %d é um número primo :)", numeroDigitado);
		break;
        } 
   }
}