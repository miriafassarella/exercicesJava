public class FolhaPagamento {

    double calcularSalario(ContratoTrabalho contratoTrabalho, double valorHoraNormal, double valorHoraExtra) {


	double resultadoHorasNormais = contratoTrabalho.valorHoraNormal * valorHoraNormal;
	double resultadoHorasExtras = contratoTrabalho.valorHoraExtra * valorHoraExtra;

	return resultadoHorasNormais + resultadoHorasExtras;


    }

}