import java.util.Arrays;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {
	Integer[] notas = {8, 5, 4, 9};

	Arrays.sort(notas, Comparator.reverseOrder()); // modifie le array en le mettant en ordre inverse.


	//ne modifie pas le array
	System.out.print(Arrays.toString(notas));

	

    }

}