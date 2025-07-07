public class BoletinMain {

    public static void main(String[] args) {

	Aluno aluno = new Aluno();

	
	Notas nota1 = new Notas();
	nota1.matematica = 5;
	nota1.portugues = 4;
	nota1.historia = 7;
	nota1.nomeAluno = "Miriã";	

	Notas nota2 = new Notas();
	nota2.matematica = 8;
	nota2.portugues = 9;
	nota2.historia = 10;
	nota2.nomeAluno = "Adriano";	
	
	

	Boletin media1 = aluno.mediaDeNotas(nota1);
	Boletin media2 = aluno.mediaDeNotas(nota2);

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