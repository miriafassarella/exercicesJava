public class FolhaPagamento {

    double calcularSalario(ContratoTrabalho contratoTrabalho, double quantidadeHorasNormais, double quantidadeHorasExtras) {


	double resultadoHorasNormais = contratoTrabalho.valorHoraNormal * quantidadeHorasNormais;
	double resultadoHorasExtras = contratoTrabalho.valorHoraExtra * quantidadeHorasExtras;
	double resultado = resultadoHorasNormais + resultadoHorasExtras;
	
	contratoTrabalho.calcularPorcentagem();

	double resultadoTotal = contratoTrabalho.porcentagemFilhos > 0 ? (resultado * contratoTrabalho.porcentagemFilhos) + resultado : resultado;
	
	return resultadoTotal;
	

    }

}