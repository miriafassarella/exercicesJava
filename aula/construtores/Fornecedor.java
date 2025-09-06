class Produto {

    String nome;
    private double preco;

    public void imprimir() {

	System.out.print(this.nome);
    }

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

	    Produto produto = new Produto();
	    produto.nome = "Cortador de gramas";

	    produto.imprimir();

	}

    }