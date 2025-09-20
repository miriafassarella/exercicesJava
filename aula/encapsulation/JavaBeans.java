public class JavaBeans {


/*
Uma classe com java beans é uma classe com encapsulamento.
Java beans = classes java reutilizaveis com propriedades encapsuladas.
Beans significa gràos.
Java beans é uma convenção de como a classe deve ser encapsulada: deve ter os metodos gethers et sethers et possuir um construtor sem atributos que deve ser declarado na classe, entre outros ...
*/

    private String atributo1;
    private int atributo2;

    JavaBeans() {

    }

    public String getAtributo1() {
	return atributo1;
    }

    public int getAtributo2() {
	return atributo2;
    }

    public void setAtributo1(String atributo1) {
	this.atributo1 = atributo1;
    }

    public void setAtributo2(int atributo2) {
	this.atributo2 = atributo2;
    }


}