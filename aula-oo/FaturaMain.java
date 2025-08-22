public class FaturaMain {

    public static void main(String[] args) {

	Fatura fatura = new Fatura();
	fatura.numero = 123;
	fatura.valorTotal = 1_293.55;

	ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();

	//String[] emailsCobranca = {"Aline@gmail.com", "Matheus@gmail.com"};


	//se usarmos o varargs não precisamos instanciar o array, podemos passsar os elementos diretamente.
	//servicoDeCobranca.pagar(fatura, "Aline@gmail.com", "matheus@gmail.com");

	//não precisamos passar o parametro quando se refere a um varargs.
	//ele precisa sempre ser o ultimo argumento.
	servicoDeCobranca.pagar(fatura, "miria@gmail.com", "Adriano@gmail.com", "Maggie@gmail.com");

	//servicoDeCobranca.pagar(fatura, new String[]{"Aline@gmail.com"});
	//servicoDeCobranca.pagar(fatura, new String[0]);

	//instanciando um array direto no parametro do método.

    }

}