
import carro.Car;

public class CarPrincipal {

    public static void main(String[] args) {

	Car carro = new Car();

	carro.marca = "Honda";
	carro.cor = "Branco";

	System.out.printf("O carro marca : %s%n", carro.marca);
	System.out.printf("O carro cor: %s", carro.cor);

	//tudo que ta dentro no pacote java.lang não precisa ser importado : System do metodo main ou Double e String etc...
	
}
}