public class Calendario {


	static String obterNomeMes(int numeroMes) {
	String[] nomeMes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
"Julho", "Agost", "Setembro", "Outubro", "Novembro", "Dezembro"};

	if (numeroMes < 1 || numeroMes > 12) {
	    throw new RuntimeException("Número Invalido !");
	}
	
	return nomeMes[numeroMes - 1];
        }



	
    

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(13);

        System.out.println(mes);
    }


}