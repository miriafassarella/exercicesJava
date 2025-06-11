import java.util.Scanner;

public class AvaliacaoAtendimento {

    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.print("Avalie o nosso atendimento (1 a 5): ");
	int nota = entrada.nextInt(); //o switch nao funciona com um long

	String descricaoNota;


	switch (nota) {
	case 1:
	    descricaoNota = "Muito ruim";
	    System.out.println(1);
	case 2:
	    descricaoNota = "Ruim";
	    System.out.println(2);
	case 3:
	    descricaoNota = "Razoável";
	    System.out.println(3);
	case 4:
	    descricaoNota = "Muito bom";
	    System.out.println(4);
	case 5:
	    descricaoNota = "Excelente";
	    System.out.println(5);
	default:
	    descricaoNota = "Opção invalida";
	    System.out.println("default");







	}

    }

}