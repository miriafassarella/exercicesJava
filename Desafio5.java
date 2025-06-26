import java.util.Scanner;


public class Desafio5 {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	boolean resposta = true;

	int somaNPares = 0;
	int somaNImpares = 0;

	do {
	    System.out.print("Digite um número inteiro: ");
	    int numero = entrada.nextInt();
		
	    System.out.print("Deseja digitar um outro número: ");
	    resposta = entrada.nextBoolean();

		if(numero % 2 == 0) {
		    somaNPares += numero;
		    
		}else {
		  somaNImpares += numero;  
		}

	}while(resposta);


	System.out.printf("Soma de todos os números pares digitados: %d%n", somaNPares);
	System.out.printf("Soma de todos os números impares digitados: %d%n", somaNImpares);



    }
}