import java.util.Scanner;

public class DesafioFolhaPagamento {

    public static void main(String[] args) {
     
	Scanner entrada = new Scanner(System.in);

	System.out.print("Entre seu nome: ");
	String nome = entrada.nextLine();

	System.out.print("Valor Hora: ");
 	double valorHora = entrada.nextDouble();

	System.out.print("Horas Trabalhadas: ");
	int horasTrabalhadas = entrada.nextInt();

	System.out.print("Descontos: ");
	double desconto = entrada.nextDouble();

	double resultado1 = valorHora * horasTrabalhadas;
	double resultado2 = resultado1 - desconto;

	System.out.printf("Folha de pagamentos: %s%n%d horas x R$%.2f = R$%.2f%nDescontos: R$%.2f%nTotal devido: R$%.2f", nome, horasTrabalhadas, valorHora, resultado1, desconto, resultado2 );




    }
}