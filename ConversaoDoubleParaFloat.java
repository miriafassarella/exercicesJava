public class ConversaoDoubleParaFloat {

    public static void main(String[] args) {

	double peso1 = 20.5;
	
	float peso2 = (float) peso1;
	
	System.out.println(peso1);
	System.out.println(peso1);

	float taxa1 = 934.5f;
	double taxa2 = (double) taxa1;

	System.out.println(taxa1);
	System.out.println(taxa2);

	/*Se un valor cabe dentro do outro, a conversao pode ser direta sem fazer o casting, se o valor nao cabe é necessario
o casting, mas pode perder valor*/

    }
}