public class FuncionarioMain {

    public static void main(String[] args) {

	Funcionario joao = new Funcionario();
	//joao.quantidadeFilhos = 2;

	ContratoTrabalho contrato = new ContratoTrabalho();
	contrato.valorHoraNormal = 25.21;
	contrato.valorHoraExtra = 27;
	contrato.funcionario = joao;

	

	FolhaPagamento folhap = new FolhaPagamento();

	double resultadoPagamento = folhap.calcularSalario(contrato, 30, 15);


	System.out.printf("Valor a pagar ao funcionario: %.2f%n", resultadoPagamento);



    }


}