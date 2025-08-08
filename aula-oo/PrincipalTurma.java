import java.util.Arrays;

public class PrincipalTurma {

    public static void main(String[] args) {

	Turma turmaB = new Turma();
	turmaB.identificacao = "Maternal B";
	turmaB.nomeProfessora = "Tia Maria";
	turmaB.alunos = new Aluno[3];

	turmaB.alunos[0] = new Aluno();
	turmaB.alunos[0].nome = "João";
	turmaB.alunos[0].idade = 3;
	
	int[] notas = {8, 5, 6, 4};

	Aluno aluno1 = new Aluno();
	aluno1.nome = "Laura";
	aluno1.idade = 4;

	turmaB.alunos[1] = aluno1;

	turmaB.imprimirListaDeAluno();


	/*for (int i = 0; i < turmaB.alunos.length; i++) {

	    if (turmaB.alunos[i] != null) {

		System.out.printf("%d - %s (%d anos)%n", i, turmaB.alunos[i].nome, turmaB.alunos[i].idade);


	    }
	    
	    

	}*/


    }


}