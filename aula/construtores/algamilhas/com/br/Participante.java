package algamilhas.com.br;

import java.util.Objects;

public class Participante {

   private String nome;
   private int saldoDePontos;
   static final int SALDO_PONTOS_INICIAL = 100;


    public Participante(String nome) {
	this(nome, SALDO_PONTOS_INICIAL);

    }

    private Participante(String nome, int saldoDePontosInicial) {
	this.nome = nome;
	this.saldoDePontos = saldoDePontosInicial;
	Objects.requireNonNull(nome, "Nome é obrigatório !");
	if (saldoDePontosInicial < 0) {
		throw new IllegalArgumentException("Saldo inicial não pode ser negativo !");
	}

    }

    public void creditarPontos(int pontos) {
	
	this.saldoDePontos += pontos;
	System.out.println(this.saldoDePontos);
	}
}