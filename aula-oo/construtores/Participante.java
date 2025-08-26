import java.util.Objects;

public class Participante {

    String nome;
    int saldoDePontos;


    Participante(String nome) {
	this(nome, saldoDePontos);

    }

    Participante(String nome, int SaldoDePontosInicial) {
	this.nome = nome;
	Objects.requireNonNull(nome, "Nome é obrigatório !");
	if (SaldoDePontosInicial < 0) {
		throw new IllegalArgumentException("Saldo inicial não pode ser negativo !");
	}

    }
}