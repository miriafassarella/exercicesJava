import java.util.Scanner;


public class CalculadoraIMC {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.print("Digite \"1\" se você for mulher et \"2\" se você for um homem : \n");
	int sexo = entrada.nextInt();
	
	System.out.print("Digite seu peso: ");
	double peso = entrada.nextDouble();

	
	System.out.print("Digite sua altura: ");
	double altura = entrada.nextDouble();

	double imc = peso / (altura * altura);
	
	

	if ((sexo == 1 && imc < 19.1) || (sexo == 2 && imc < 20.7)) {

	  	 System.out.println("Você esta a baixo do peso ideal !");

	} else if ((sexo == 1 && (imc >= 19.1 && imc <= 25.8)) || (sexo == 2 && (imc >= 26.5 && imc <= 27.8))) {
	   	 System.out.println("Você esta no seu peso ideal !");

	} else if ((sexo == 1 && (imc >= 25.9 && imc <= 27.3)) || (sexo == 2 && (imc >= 26.5 && imc <= 27.8))) {
 
	    	System.out.println("Você está um pouco acima do peso !");

	} else if ((sexo == 1 && (imc >= 27.4 && imc <= 32.3)) || (sexo == 2 && (imc >= 27.9 && imc <= 31.1))) {

		System.out.println("Você está acima do peso ideal !");

	} else if ((sexo == 1 && imc > 32.3) || (sexo == 2 && imc > 31.1)) {

	    	System.out.println("Cuidado, você é uma pessoa obesa !");


	}
	

	


    }



}