public class Principal {

    public static void main(String[] args) {


	Pessoa eu = new Pessoa();
	eu.nome = "Miriã";
	eu.cpf = "104.332.117-92";
	eu.anoNascimento = 1984;

	

	Carro meuCarro = new Carro();

	meuCarro.modelo = "Civic";
	meuCarro.cor = "Branco";
	meuCarro.fabricante = "Honda";
	meuCarro.ano = 2017;
	meuCarro.proprietario = eu;


	Carro seuCarro = new Carro();
	seuCarro.modelo = "Infiniti Q50";
	seuCarro.cor = "Vermelho";
	seuCarro.fabricante = "Hyundai";
	seuCarro.ano = 2022;
	seuCarro.proprietario = new Pessoa();
	seuCarro.proprietario.nome = "Adriano";
	seuCarro.proprietario.cpf = "999.999.999-99";
	seuCarro.proprietario.anoNascimento = 1983;



	System.out.println("Meu carro:" );

	System.out.printf("Modelo: %s%n", meuCarro.modelo);
	System.out.printf("Cor: %s%n", meuCarro.cor);
	System.out.printf("Fabricante: %s%n", meuCarro.fabricante);
	System.out.printf("Ano de fabricação: %s%n", meuCarro.ano);
	System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);


	System.out.println();
	System.out.println("---------------------------------------");


	System.out.println("Seu carro: ");

	System.out.printf("Modelo: %s%n", seuCarro.modelo);
	System.out.printf("Cor: %s%n", seuCarro.cor);
	System.out.printf("Fabricante: %s%n", seuCarro.fabricante);
	System.out.printf("Ano de fabricação: %s%n", seuCarro.ano);
	System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);




    }
}