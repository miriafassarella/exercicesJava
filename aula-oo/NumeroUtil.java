public class NumeroUtil {


    public static void maiorNumero(int numero1, int numero2) {

	int numeroMaior = numero1 > numero2 ? numero1 : numero2;

	System.out.println(numeroMaior);
	
    }

    
    public static void maiorNumero(int numero1, int numero2, int numero3) {
	
	int[] numeros  = {numero1, numero2, numero3};

	int maior = 0;
	for (int i = 0; i < numeros.length; i++) {
	    if (numeros[i] > maior) {
		maior = numeros[i];
	    }
	}
	System.out.println(maior);

	
     }

    public static void maiorNumero(double numero1, double numero2) {

	double numeroMaior = numero1 > numero2 ? numero1 : numero2;

	System.out.println(numeroMaior);

     }

    public static void maiorNumero(double numero1, double numero2, double numero3) {

	double[] numeros = {numero1, numero2, numero3};
	double maior = 0.0;

	for (int i = 0; i < numeros.length; i++) {

	    if (numeros[i] > maior) {
		maior = numeros[i];
	    }
	}

	System.out.println(maior);


    }
}