public class ExemploString {

    public static void main(String[] args) {
	
	System.out.println("Fala, mergulhador!");

	int x = 10;
	int y = 5;
	int z = x + y;

	System.out.println("Resultado : " + (x + y)); //aqui estou falando que a operação tem precedencia.

	//o compilador só começa a fazer a contatenação a partir do momento que ele encontra um texto.

	String nome = "Miriã";
	int idade = 41;

	
	System.out.println(nome + " tem " + idade + " anos ");

	


     }

}