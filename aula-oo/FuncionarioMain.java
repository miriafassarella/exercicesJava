public class FuncionarioMain {

    public static void main(String[] args) {

	ContratoTrabalho contrato = new ContratoTrabalho();
	contrato.valorHoraNormal = 25.21;
	contrato.valorHoraExtra = 27;

	FolhaPagamento folhap = new FolhaPagamentoc();

	double resultadoPagamento = folhap.calcularSalario(contrato, 30, 15);


	System.out.printf("Valor a pagar ao funcionario: %.2f%n", resultadoPagamento);



    }


}