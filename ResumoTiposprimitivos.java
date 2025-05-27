public class ResumoTiposprimitivos {

    public static void main(String[] args) {
	
	//1 bit = menor unidade de armazenamento. (menor variavel pode se dizer assim.)
	//1 byte = 8 bits

	//boolean = valor booleano
	//char = caractere et tem que ser aspas simples e apenas um caracter
	//byte = numeros inteiros
	//short = numeros inteiros

	//int et long = inteiros

	//float et double  = numeros flutuantes onde o double é o maior.


	int x = 2_147_483_647;// undescore para melhorar a leitura.

	long y = x;
	
	System.out.println(x);
	System.out.println(y);


	long l = 2_147_483_647;
	int i = (int) l;

	System.out.println(l);
	System.out.println(i);

    }

}