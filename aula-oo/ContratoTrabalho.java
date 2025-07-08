public class ContratoTrabalho {

   


    Funcionario funcionario;

    double valorHoraNormal;

    double valorHoraExtra;  

    double porcentagemFilhos; 


   public void calcularPorcentagem() {
	if(funcionario.temFilhos()) {
	    porcentagemFilhos = 0.10;
	}	
    } 
}