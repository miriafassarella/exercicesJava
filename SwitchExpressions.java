import java.util.Scanner;

public class SwitchExpressions {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
	String diaSemana = entrada.nextLine();

	System.out.print("Digite um mês: ");
	int mes = entrada.nextInt();


	//switch expressions à partir do java 14 (somos obrigados a colocar o default já que estamos atribuindo a uma variavel).

	
	/*String horarioFuncionamento = switch(diaSemana) {
	    case "seg" -> "Fechado";
	    case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
	    case "sab", "dom" -> "08:00 às 12:00";
	    default -> "invalido";
		
	};*/


	/*switch(diaSemana) {
	    case "seg" -> horarioFuncionamento = "Fechado";
	    case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 às 18:00";
	    case "sab", "dom" -> {horarioFuncionamento = "08:00 às 12:00";}
	    default -> horarioFuncionamento = "Dia invalido";
		
	}*/

	System.out.printf("Horário de funcionamento: %s%n", switch(diaSemana) {
	    case "seg" -> {
			if (mes == 12) {
			yield "08:00 às 18:00"; //yield só pode ser usado aqui.
			}
			yield "Fechado";}
	    case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
	    case "sab", "dom" -> "08:00 às 12:00";
	    default -> "invalido";
		
	}
);

    }

}