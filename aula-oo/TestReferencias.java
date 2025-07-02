public class TestReferencias {

    public static void main(String[] args) {

	Pessoa pessoa1 = new Pessoa();
	pessoa1.nome = "Miria";
	pessoa1.cpf = "104.332.117-92";
	pessoa1.anoNascimento = 1984;


	Carro meuCarro = new Carro(); //meuCarro é apenas o nome da variável que faz referencia ao objeto.
	meuCarro.proprietario = pessoa1;
	meuCarro.modelo = "Civic";
	meuCarro.ano = 2017;

	Carro seuCarro = new Carro();
	seuCarro.proprietario = pessoa1;
	seuCarro.proprietario.nome = "João";
	seuCarro.modelo = "Infiniti";
	seuCarro.ano = 2022;

	int anoFabricacao = meuCarro.afficherAno();


	//meuCarro.calcularValorRevenda();
	//seuCarro.calcularValorRevenda();
	System.out.printf("Ano de fabricação do carro : %s%n", meuCarro.modelo);
	System.out.print(anoFabricacao);


	//System.out.printf("Proprietario do meu carro: %s%n", meuCarro.proprietario.nome);
	//System.out.printf("Proprietario do seu carro: %s%n",seuCarro.proprietario.nome);


    }
}