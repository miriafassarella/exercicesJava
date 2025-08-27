import java.util.Objects;
import java.util.UUID;

public class Produto {

     static final int QUANTIDADE_ESTOQUE_INICIAL = 100;
	
     String nome;
     final String codigo;
     int quantidadeEstoque;

     Produto() {
	this("Sem nome"); 
	//essa instrução tem que vir no início.
	//this.codigo = "DDUI";  não posso inicializar aqui

	}

      Produto(String nome) {
	this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

     Produto(String nome, int estoqueInicial) {
	Objects.requireNonNull(nome, "Nome é obrigatório !");
	
	if (estoqueInicial < 0) {
	
	    throw new IllegalArgumentException("Estoque inicial não pode ser negativo !");

	}

	this.nome = nome;
	this.quantidadeEstoque = estoqueInicial;
	
	this.codigo = UUID.randomUUID().toString();
	//UUId = identificador unico universal
	//codigo que tem a possibilidade de duplicacao muito proximo de zero. 

     }
}