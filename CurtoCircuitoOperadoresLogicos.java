public class CurtoCircuitoOperadoresLogicos {

    public static void main(String[] args) {

	int x = 15;
	int y = 20;

	//int inteiro = y++;
	//boolean resultado = x == 10 && y++ == 20;
	
	// && => o java só avalia a segunda expressao se a primeira for verdadeira.

	boolean resultado = x == 10 || y++ == 20;

	System.out.println(resultado);
	System.out.println(y);

    }



}