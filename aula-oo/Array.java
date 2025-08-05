import java.util.Arrays;

public class Array{

    public static void main(String[] args) {

	int[] notas = {8, 5, 4, 9, 18}; // array é um objeto

	notas[3] = 20; 
	double soma = 0;

	//System.out.print(notas[notas.length - 2]);


	//usado para quando você não pecisa do indice.
	//int j = 0;
	for (int i : notas) {

	    soma += i;
	   // j++;
	}

	System.out.print("Média de notas: " + (soma / notas.length));
	System.out.print(Arrays.toString(notas));

	//Arrays.toString(notas); Transforma o array em uma string
    }

    

}