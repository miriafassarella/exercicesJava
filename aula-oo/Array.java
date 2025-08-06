import java.util.Arrays;
import java.util.Comparator;

public class Array{

    public static void main(String[] args) {

	Integer[] notas = {8, 5, 4, 9, 18}; // array é um objeto

	

	System.out.println(Arrays.toString(notas));

	Arrays.sort(notas); //ordena crescente os numeros no array

	
	System.out.println(Arrays.toString(notas));

	Arrays.sort(notas, Comparator.reverseOrder()); // ordennado de forma inversa.

	System.out.print(Arrays.toString(notas));

	    }

    

}