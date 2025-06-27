public class Principal {

    public static void main(String[] args) {

	Carro meuCarro = new Carro();

	meuCarro.modelo = "Civic";
	meuCarro.cor = "Branco";
	meuCarro.fabricante = "Honda";
	meuCarro.ano = 2017;


	Carro seuCarro = new Carro();
	seuCarro.modelo = "Infiniti Q50";
	seuCarro.cor = "Vermelho";
	seuCarro.fabricante = "Hyundai";
	seuCarro.ano = 2022;



	System.out.println("Meu carro:" );

	System.out.printf("Modelo: %s%n", meuCarro.modelo);
	System.out.printf("Cor: %s%n", meuCarro.cor);
	System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
	System.out.printf("Ano de fabricação: %s%n", meuCarro.ano);

	System.out.println();
	System.out.println("---------------------------------------");


	System.out.println("Seu carro: ");

	System.out.printf("Modelo: %s%n", seuCarro.modelo);
	System.out.printf("Cor: %s%n", seuCarro.cor);
	System.out.printf("Fabricante: %s%n", seuCarro.fabricante);
	System.out.printf("Ano de fabricação: %s%n", seuCarro.ano);




    }
}