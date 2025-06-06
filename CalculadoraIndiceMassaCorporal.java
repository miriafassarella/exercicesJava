import java.util.Scanner;


public class CalculadoraIndiceMassaCorporal {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.print("Peso: ");
	int peso = entrada.nextInt();

	System.out.print("Altura: ");
	double altura = entrada.nextDouble();

	double imc = peso / (altura * altura);

	boolean abaixoPesoIdeal = imc < 18.5;

	if (abaixoPesoIdeal) {
	    System.out.println("Abaixo do peso ideal."); /*podemos contruir o if sem as chaves, mas se ele conter mais de uma linhade instrução
corremos o risco de a segunda instrução imprimir mesmo se a condição não for verdadeira*/

	}
	
	System.out.println("Fim do programa.");


    }


}