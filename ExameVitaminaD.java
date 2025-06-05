import java.util.Scanner;

public class ExameVitaminaD {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Grupo de risco: ");
	boolean grupoDeRisco = entrada.nextBoolean();

	System.out.print("Vitamina D: ");
	double vitaminaD = entrada.nextDouble();

	boolean vitaminaDNormal = (!grupoDeRisco && vitaminaD > 20) 
|| (grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60);

	int x = 3;
	int y = 2;
	int z = 1;

	boolean dev = x == 2 || y == 2 && z == 1;
	
	System.out.printf("Vitamina D normal: %b%n", dev);

	//!grupoDeRisco = quer dizer que grupo de risco é igual a false.
	//o operador && tem precedencia.

}
}