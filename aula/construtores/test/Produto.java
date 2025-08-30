package test;

import java.util.Objects;
import java.util.UUID;

public class Produto {

     static final int QUANTIDADE_ESTOQUE_INICIAL = 100;
	
     public String nome;
     public final String codigo;
     public int quantidadeEstoque;

     public Produto() {
	this("Sem nome"); 
	//essa instrução tem que vir no início.
	//this.codigo = "DDUI"; não posso inicializar aqui

	}

     public Produto(String nome) {
	this(nome, QUANTIDADE_ESTOQUE_INICIAL);
	
    }

    public Produto(String nome, int estoqueInicial) {
	Objects.requireNonNull(nome, "Nome é obrigatório !");
	
	if (estoqueInicial < 0) {
	
	    throw new IllegalArgumentException("Estoque inicial não pode ser negativo !");

	}

	this.nome = nome;
	this.quantidadeEstoque = estoqueInicial;
	
	this.codigo = gerarCodigo();
	//UUId = identificador unico universal
	//codigo que tem a possibilidade de duplicacao muito proximo de zero. 

     }


	//private restringe o total acesso a variavel de fora da classe
     private String gerarCodigo() {

	return UUID.randomUUID().toString();
	//UUId = identificador unico universal


    }
}