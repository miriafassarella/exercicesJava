class Produto {

    String nome;
    private double preco;
    Fabricante fabricante;
    Comprador comprador;

    public void imprimir() {

	System.out.println(this.nome);
	System.out.println(this.fabricante.nome);
    }

}


class Comprador {

     String nome;
     Comprador(String nome) {
	this.nome = nome;
     }

     void imprimir() {

	System.out.print(this.nome);
}

}

class Fabricante {
    String nome;
    

 }

public class Fornecedor {
    //não podemos ter duas classes publicas em um mesmo arquivo
    //não é obrigatorio ter uma classe publica dentro de um arquivo .java
    //porêm se o arquivo tem uma classe publica, o aquivo deve conter o mesmo nome da classe publica.
    //Ponto muito importante : se eu crio duas classes em um mesmo arquivo, a JVM cria uma outra classe na pasta.
    //Lembrando que eu não consigo fazer um javac na classe produto, já que ela não é uma classe pública, então o arquivo não pode conter o seu nome.
    //não tem necessidade de criar duas classes em um mesmo arquivo, exceto si você queira dar palestras e dar exemplos durante a explicação.
    //não se usa em produção.

    
	public static void main(String[] args) {

	    Fabricante fab = new Fabricante();
	    fab.nome = "Samsung";

	    Produto produto = new Produto();
	    produto.nome = "Cortador de gramas";
	    produto.fabricante = fab;
	    produto.comprador = new Comprador("Miria");

	    produto.imprimir();
	    produto.comprador.imprimir();

	}

    }