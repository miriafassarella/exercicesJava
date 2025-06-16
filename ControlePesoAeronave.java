import java.util.Scanner;

public class ControlePesoAeronave {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.print("Peso máximo da aeronave: ");
	int pesoMaximo = entrada.nextInt();

	System.out.print("Quantidade de passageiros: ");
	int totalPassageiros = entrada.nextInt();

	int pesoTotalPassageiros = 0;

	for (int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++) {

		System.out.printf("Peso do passageiro: %d kg%n", passageiroAtual);
		int pesoPassageiro = entrada.nextInt();

		pesoTotalPassageiros += pesoPassageiro;
	}

	
	System.out.printf("Peso máximo da aéronave: %d kg%n", pesoMaximo);
	System.out.printf("Peso total dos passageiros : %d kg%n", pesoTotalPassageiros);
	System.out.printf("Situação da aéronave : %s%n", pesoTotalPassageiros > pesoMaximo ? "A aéronave não pode decolar : Perigo !" : "Aéronave liberada para vôo !");





    }



}