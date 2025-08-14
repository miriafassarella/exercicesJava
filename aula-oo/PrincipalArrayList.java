import java.util.ArrayList;

public class PrincipalArrayList {

    public static void main(String[] args) {

	ArrayList<String> alunos = new ArrayList<>();

	alunos.add("Miriã");
	alunos.add("Adriano");
	alunos.add("Mia");

	for (int i = 0; i < alunos.size(); i++) {
	
	    System.out.printf("O nome do aluno é %s.%n", alunos.get(i));

	}



    }
}