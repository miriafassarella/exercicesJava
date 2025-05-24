public class ExemploLong {
    public static void main(String[] args) {
	
	long populacaoUberlandia = 699_097;
	
	/*long populacaouberlandia2 = 2_147_483_648; não compila pois o tipo literal vai ser sempre um numero inteiro e esse valor ultrapassa um inteiro*/
	
	/*System.out.println(2147483648); tambem nao compila pois o numero que digitamos(ou seja literal será sempre um inteiro).
	
	long populacaouberlandia2 = 2_147_483_648L; /*aqui compila, precisamos adicionar o L ou l no final para dizer para o 

	compilador que estamos tratando de um long*/

	// À partir do Java 7 podemos usar um underscore para melhorar a legibilidade do numero na casa do milhar.

	System.out.println(2_147_483_648l);
    }
}