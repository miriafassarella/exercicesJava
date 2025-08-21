public class FaturaMain {

    public static void main(String[] args) {

	Fatura fatura = new Fatura();
	fatura.numero = 123;
	fatura.valorTotal = 1_293.55;

	ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();

	//String[] emailsCobranca = {"Aline@gmail.com", "Matheus@gmail.com"};

	servicoDeCobranca.pagar(fatura, new String[]{"Aline@gmail.com"});
	//instanciando um array direto no parametro do método.

    }

}