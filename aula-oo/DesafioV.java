import java.util.Arrays;

public class DesafioV {


    public static void calcularMedia(double numero1, double numero2, double... numeros) {

	double soma = 0;

	numeros = Arrays.copyOf(numeros, numeros.length + 2);

	numeros[numeros.length - 2] = numero1;
	numeros[numeros.length - 1] = numero2;

	for (double numero : numeros) {
		
	    soma += numero;

	}
	
	double media = soma / numeros.length;

	System.out.printf("Média dos numeros digitados: %.2f", media); 
    }



}