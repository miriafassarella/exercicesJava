import java.util.Scanner;


public class TreinoFor {

    public static void main(String[] args) {


	Scanner entrada = new Scanner(System.in);

	System.out.print("Digite uma palavra: ");
	String palavra = entrada.nextLine();
	

	int j = 0;

	String novaString = "";

	for (int i = palavra.length() - 1; i >= 0; i--) {
		
		if (palavra.charAt(i) == palavra.charAt(j)){
			char letra = palavra.charAt(j);
			novaString += letra;
			j++;
		}
			
	}
	

	
	if (palavra.equalsIgnoreCase(novaString)) {

	    System.out.println("\"" + palavra + "\"" + " é um polindromo!");
	}else {
	    System.out.println("\"" + palavra + "\"" + " não é um polindromo!");
	}	 

}

}