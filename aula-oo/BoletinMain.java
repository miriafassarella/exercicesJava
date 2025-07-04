public class BoletinMain {

    public static void main(String[] args) {

	



	

	Aluno aluno1 = new Aluno();
	aluno1.nome = "Miriã";
	aluno1.notasMatematica = 5.5;
	aluno1.notasPortugues = 4;
	aluno1.notasHistoria = 6;
	

	Aluno aluno2 = new Aluno();
	aluno2.nome = "Adriano";
	aluno2.notasMatematica = 4.5;
	aluno2.notasPortugues = 6;
	aluno2.notasHistoria = 3;
	

	Boletin media1 = aluno1.mediaDeNotas();
	Boletin media2 = aluno2.mediaDeNotas();

	if (media1.mediaBaixa()) {
	    
	    System.out.printf("A média do aluno(a) %s está baixa. Média : %.2f%n", aluno1.nome, media1.resultado);

	}else {

	    System.out.printf("A média do aluno(a) %s é de : %.2f%n", aluno1.nome, media1.resultado);
	}

	if (media2.mediaBaixa()) {

	    System.out.printf("A média do aluno(a) %s está baixa. Média : %.2f%n", aluno2.nome, media2.resultado);

	}else {

	    System.out.printf("A média do aluno(a) %s é de : %.2f%n", aluno2.nome, media2.resultado);
	}


	
	

	

    }


}