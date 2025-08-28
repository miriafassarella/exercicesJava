public class Carro {


    String cor;
    String modelo;
    String fabricante;
    int ano;
    Pessoa proprietario; //composição
//tipo que nós mesmos criamos. O carro tem um proprietário.


    



   void calcularValorRevenda() {

	if (this.ano > 2022) {

	    System.out.println("Carro novo, não precisa calcular revenda !");
		return; //usado apenas para sair do método.
	    

	}

	System.out.printf("Calcular valor revenda do carro: %s %d%n", modelo, ano);

   }

   int afficherAno() {

	return this.ano;
   }
    
}