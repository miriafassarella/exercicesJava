public class FolhaPagamento {

    Holerite calcularSalario(double horasNormais, double horasExtras, ContratoTrabalho contrato) {


	Holerite novoHolerite = new Holerite();
	novoHolerite.funcionario = contrato.funcionario;
	novoHolerite.calcularValorTotal(horasNormais, horasExtras, contrato.valorHoraNormal, contrato.valorHoraExtra);

	if (contrato.porcentagemFilho()) {

		novoHolerite.salario += novoHolerite.salario * 0.10;
	}
	novoHolerite.imprimir();
	

	return novoHolerite;

}

}