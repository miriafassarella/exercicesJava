import java.util.Scanner;

public class UsoCorretoWhile {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.print("Peso máximo da aeronave: ");
	int pesoMaximo = entrada.nextInt();

	
	int pesoTotalPassageiros = 0;

	int passageiroAtual = 1;

	boolean incluirNovoPassageiro = true;

//aqui não sabemos quantas vezes o while deve ser rodado.
	while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {

		System.out.print("Peso do passageiro: ");
		int pesoPassageiro = entrada.nextInt();

		pesoTotalPassageiros += pesoPassageiro;

	System.out.print("Incluir novo passageiros? ");
	incluirNovoPassageiro = entrada.nextBoolean();
	

	}

	
	System.out.printf("Peso máximo da aéronave: %d kg%n", pesoMaximo);
	System.out.printf("Peso total dos passageiros : %d kg%n", pesoTotalPassageiros);
	System.out.printf("Situação da aéronave : %s%n", pesoTotalPassageiros > pesoMaximo ? "A aéronave não pode decolar : Perigo !" : "Aéronave liberada para vôo !");





    }



}