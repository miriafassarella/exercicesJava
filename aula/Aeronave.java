public class Aeronave {

    
    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;


    
    public void desativar() {
	this.ativo = false;
    }


    public void ativar() {
	this.ativo = true;

    }

    public void reservarAssentos(int numeroAssentos) {

	if (this.ativo) {
	    this.assentosReservados += numeroAssentos;
	    
	    
	}else {
	    System.out.println("Aeronave desativada. Assentos não reservados.");
	
	 }//o break só pode ser usado dentro de um loop
    }

    int calcularAssentosDisponiveis() {

	return totalAssentos - assentosReservados;
    }

}