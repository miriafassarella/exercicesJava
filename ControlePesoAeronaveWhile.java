import java.util.Scanner;

public class ControlePesoAeronaveWhile {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.print("Peso máximo da aeronave: ");
	int pesoMaximo = entrada.nextInt();

	System.out.print("Quantidade de passageiros: ");
	int totalPassageiros = entrada.nextInt();

	int pesoTotalPassageiros = 0;

	int passageiroAtual = 1;

//Devemos usar o while quando não sabemos exatamente a quantidade de repetições que precisam ser feitas.
//se sabemos quantas vezes o loop deve ser rodado, usamos o for
	while (passageiroAtual <= totalPassageiros) {

		System.out.printf("Peso do passageiro: %d kg%n", passageiroAtual);
		int pesoPassageiro = entrada.nextInt();

		pesoTotalPassageiros += pesoPassageiro;

	passageiroAtual++;
	}

	
	System.out.printf("Peso máximo da aéronave: %d kg%n", pesoMaximo);
	System.out.printf("Peso total dos passageiros : %d kg%n", pesoTotalPassageiros);
	System.out.printf("Situação da aéronave : %s%n", pesoTotalPassageiros > pesoMaximo ? "A aéronave não pode decolar : Perigo !" : "Aéronave liberada para vôo !");





    }



}