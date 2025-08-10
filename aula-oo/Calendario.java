public class Calendario {

    
   

   static String obterNomeMes(int numeroMes) {
	
	 String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	
	
	return mes[numeroMes - 1];
   }

    public static void main(String[] args) {

	 System.out.print(Calendario.obterNomeMes(7));
	

    }
}