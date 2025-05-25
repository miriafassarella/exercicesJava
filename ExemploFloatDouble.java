public class ExemploFloatDouble {

//não devem ser usados para valores monetários (double e float) pois podemos perder precisão no valor.
    public static void main(String[] args) {
        //double peso = 2_147_483_648; //nao compila

	
	double peso = 2.9; /*o ponto para a casa decimal já diz para o compilador que se trata de um double, então não precisamos colocar a letra d no final da instrução*/
        
	System.out.println(peso);


	float taxa = 1_294.93f;
 /*quando se trata de casa decimal, o bouble é o numero literal, se passamos um numero maior em um float, precisamos colocar o F no final.*/
	System.out.println(taxa);
    }
}