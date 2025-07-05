public class BoletinMain {

    public static void main(String[] args) {

	



	

	Aluno aluno = new Aluno();
	
	

	//Aluno aluno2 = new Aluno();
	
	

	Boletin media1 = aluno.mediaDeNotas("Miria", 4.5, 6, 7);
	Boletin media2 = aluno.mediaDeNotas("Adriano", 5, 4, 2.5);

	if (media1.mediaBaixa()) {
	    
	    System.out.printf("A média do aluno(a) %s está baixa. Média : %.2f%n", media1.nomeAluno, media1.resultado);

	}else {

	    System.out.printf("A média do aluno(a) %s é de : %.2f%n", media1.nomeAluno, media1.resultado);
	}

	if (media2.mediaBaixa()) {

	    System.out.printf("A média do aluno(a) %s está baixa. Média : %.2f%n", media2.nomeAluno, media2.resultado);

	}else {

	    System.out.printf("A média do aluno(a) %s é de : %.2f%n", media2.nomeAluno, media2.resultado);
	}


	
	

	

    }


}