import java.util.Arrays;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {
	int[] numerosJogo1 = {25, 11, 8, 46, 37, 14};
	Integer[] numerosJogo3 = {25, 11, 8, 46, 37, 14};

	//un array par default ne peut pas être élargi.
    	int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, numerosJogo1.length + 1);
	
	Arrays.sort(numerosJogo1);
	
	Arrays.sort(numerosJogo3, Comparator.reverseOrder());

	System.out.println(Arrays.toString(numerosJogo3));

    	//System.out.println(Arrays.toString(numerosJogo2));

	System.out.println("-------------------------------------------");

	Aluno aluno = new Aluno();
	aluno.nome = "Miriã";
	aluno.idade  = 41;

	Aluno aluno2 = new Aluno();
	aluno2.nome = "Bart";
	aluno2.idade = 14;

	Turma turma = new Turma();
	turma.adicionandoAlunos(aluno);
	turma.adicionandoAlunos(aluno2);

	turma.imprimir();
	

    }

}