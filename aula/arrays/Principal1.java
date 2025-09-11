import java.util.Arrays;

public class Principal1 {

    public static void main(String[] args) {

	//não é possível tirar um elemento de um array

	int numeroExclusao = 2;

	int[] numerosJogoAtual = {25, 11, 8, 46, 37, 14, 55};
	int[] numerosNovoJogo = new int[numerosJogoAtual.length - 1];

	System.arraycopy(numerosJogoAtual, 0, numerosNovoJogo, 0, numeroExclusao);
	System.arraycopy(numerosJogoAtual, numeroExclusao + 1, numerosNovoJogo, numeroExclusao, numerosNovoJogo.length - numeroExclusao);


	System.out.println(Arrays.toString(numerosJogoAtual));
	System.out.println(Arrays.toString(numerosNovoJogo));

	

   }
}