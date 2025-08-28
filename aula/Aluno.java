public class Aluno {


    String nome;
    int idade;

   
     Boletin mediaDeNotas(Notas notas) {

	Boletin boletim = new Boletin();

	boletim.nomeAluno = notas.nomeAluno;
	boletim.matematica = notas.matematica;
	boletim.portugues = notas.portugues;
	boletim.historia = notas.historia;

	
	 boletim.resultado = (boletim.matematica + boletim.portugues + boletim.historia) / 3; 

	

	return boletim;

    }


}