import java.util.Arrays;

public class Turma {

    Aluno[] alunos = new Aluno[0];


    public void adicionandoAlunos(Aluno aluno) {

	this.alunos = Arrays.copyOf(alunos, alunos.length + 1);

	alunos[alunos.length - 1] = aluno; 

    }

    public void imprimir() {

	for(Aluno aluno : this.alunos) {

	    if (aluno != null) {
		System.out.printf("Nome: %s, idade: %d%n", aluno.nome, aluno.idade);

	    }else {
			
		System.out.print("vago");


	    }
	}
    
    }
    
}