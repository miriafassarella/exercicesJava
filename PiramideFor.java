import java.util.Scanner;

public class PiramideFor {

    public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);

	System.out.print("Digite um número inteiro positivo: ");
	int numero = entrada.nextInt();

	for (int i = 0; i < numero; i++) {
	   
	   for(int j = 0; j < i  ; j++) {
			
			 System.out.print("*");

		}
	  
	System.out.println("*");
	    
	}
	

    }

}