import java.util.Scanner;


public class TreinoFor {

    public static void main(String[] args) {


	Scanner entrada = new Scanner(System.in);

	System.out.print("Digite uma palavra: ");
	String palavra = entrada.nextLine();

	String novaString = "";

	for (int i = palavra.length(); i <= palavra.length(); i--) {
		
		novaString += palavra.charAt(i);

	}
	
	
	if (palavra == novaString) {

	    System.out.println("\"" + palavra + "\"" + " é um polindromo!");
	}	 

}

}