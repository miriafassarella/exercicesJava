public class FuncionarioMain {

    public static void main(String[] args) {

	Funcionario funcionario1 = new Funcionario();
	funcionario1.quantidadeFilhos = 0;
	funcionario1.nome = "Miria";

	
	ContratoTrabalho contrato = new ContratoTrabalho();
	contrato.valorHoraExtra = 30;
	contrato.valorHoraNormal = 25.21;
	contrato.funcionario = funcionario1;

	FolhaPagamento pagamento = new FolhaPagamento();
	//Holerite resultado = 
	pagamento.calcularSalario(30, 5, contrato);

	//System.out.print(resultado);
	
    }


}