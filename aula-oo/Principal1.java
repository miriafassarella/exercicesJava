import java.util.Arrays;

public class Principal1 {

    public static void main(String[] args) {
	
	int[] numerosAtuais = {25, 11, 8, 46, 37, 14, 55};
	int[] numerosNovos = new int[numerosAtuais.length - 1];

	System.out.println(Arrays.toString(numerosAtuais));
	System.out.println(Arrays.toString(numerosNovos));

	int numero = 37;
	int j = 0;

	for (int i = 0; i < numerosAtuais.length; i++) {
		
				
	   	if(numero != numerosAtuais[i]) {
					    
			    numerosNovos[j] = numerosAtuais[i];
			    j++;
		}	    
	}

	System.out.println(Arrays.toString(numerosAtuais));
	System.out.println(Arrays.toString(numerosNovos));



    }
}