public class Carro {


    String cor;
    String modelo;
    String fabricante;
    int ano;
    Pessoa proprietario; //composição
//tipo que nós mesmos criamos. O carro tem um proprietário.



   void calcularValorRevenda() {

	System.out.printf("Calcular valor revenda do carro: %s %d%n", modelo, ano);

   }
    
}