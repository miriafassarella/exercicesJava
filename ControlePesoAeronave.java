import java.util.Scanner;

public class ControlePesoAeronave {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.print("Peso máximo da aéronave: ");
	int pesoMaximo = entrada.nextInt();

	int pesoTotalPassageiros = 0;

	while (true) {
	System.out.print("Peso do passageiro: ");
	int pesoPassageiro = entrada.nextInt();
	
	

	if(pesoTotalPassageiros + pesoPassageiro > pesoMaximo){
		
		continue;
	}else {
	pesoTotalPassageiros += pesoPassageiro;

	}	

}



	
	System.out.printf("Peso máximo da aéronave: %d kg%n", pesoMaximo);
	System.out.printf("Peso total dos passageiros : %d kg%n", pesoTotalPassageiros);
	System.out.printf("Situação da aéronave : %s%n", pesoTotalPassageiros > pesoMaximo ? "A aéronave não pode decolar : Perigo !" : "Aéronave liberada para vôo !");





    }
}