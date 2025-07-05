public class Aluno {

   
    
    
    
    


    Boletin mediaDeNotas( String nomeAluno, double notasMatematica, double notasPortugues, double notasHistoria) {

	Boletin notas = new Boletin();

	notas.nomeAluno = nomeAluno;
	notas.matematica = notasMatematica;
	notas.portugues = notasPortugues;
	notas.historia = notasHistoria;

	
	 notas.resultado = (notas.matematica + notas.portugues + notas.historia) / 3; 

	

	return notas;

    }


}