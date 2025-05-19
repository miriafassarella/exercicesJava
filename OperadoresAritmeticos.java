public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int minhaIdade = 41;
        int suaIdade = 42;
	
	//Adição
	int totalIdades = minhaIdade + suaIdade + 100;
	
	System.out.println("Total idades: " + totalIdades);

	//Subtração
	int diferencaIdades = suaIdade - minhaIdade;
	System.out.println("Diferença das idades: " + diferencaIdades);

	//Multiplicação
	int dobroIdade = 2 * suaIdade;
	System.out.println("Dobro da sua idade: " + dobroIdade);

	//Divisão
	int metadeIdade = suaIdade / 2;
	System.out.println("Metade da sua idade : " + metadeIdade);

	//Módulo
	int restoDivisao = 7 % 2;
	System.out.println("Resto da divisão (módulo): " + restoDivisao);



}

}