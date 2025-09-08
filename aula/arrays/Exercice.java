import java.util.Arrays;
import java.util.Comparator;

public class Exercice {

    public static void main(String[] args) {

	Integer[] numeros = {7, 9, 4, 2, 9, 10};

	Arrays.sort(numeros, Comparator.reverseOrder());

	System.out.print(Arrays.toString(numeros));
	
	

    }

}