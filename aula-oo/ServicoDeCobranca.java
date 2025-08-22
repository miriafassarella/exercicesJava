import java.util.Objects;
import java.util.Arrays;

public class ServicoDeCobranca {

	//varargs
    void pagar (Fatura fatura, String emailCobranca, String... emailsAdicionais) {

		
		emailsAdicionais = Arrays.copyOf(emailsAdicionais, emailsAdicionais.length + 1);
		emailsAdicionais[emailsAdicionais.length - 1] = emailCobranca;

	Objects.requireNonNull(fatura, "A fatura não pode ser nula!");
	
	System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n", fatura.numero, fatura.valorTotal);
	
	
	
	for (String email : emailsAdicionais) {
	
	    System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);

	}

    }
}