public class PrincipalAeronave {

    public static void main(String[] args) {


	Aeronave aviaoGol = new Aeronave();
	aviaoGol.totalAssentos = 100;

	//aviaoGol.desativar();

	aviaoGol.reservarAssentos(10);

	System.out.printf("GOL (%S): %d assentos disponíveis.%n", aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calcularAssentosDisponiveis());


    }


}