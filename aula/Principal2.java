import java.util.Arrays;

public class Principal2 {

    public static void main(String[] args) {

	int[] numerosAtuais = {25, 11, 8, 46, 37, 14, 55};
	int[] numerosNovos = new int[numerosAtuais.length - 1];

	System.out.println(Arrays.toString(numerosAtuais));
	System.out.println(Arrays.toString(numerosNovos));

	int indiceExclusao = 3;

	System.arraycopy(numerosAtuais, 0, numerosNovos, 0, indiceExclusao);
	/*System.arraycopy(numerosAtuais, indiceExclusao + 1, numerosNovos, indiceExclusao,
numerosAtuais.length - (indiceExclusao + 1));*/

	System.arraycopy(numerosAtuais, indiceExclusao + 1, numerosNovos, indiceExclusao,
numerosNovos.length - indiceExclusao);


	System.out.println(Arrays.toString(numerosAtuais));
	System.out.println(Arrays.toString(numerosNovos));




    }

}