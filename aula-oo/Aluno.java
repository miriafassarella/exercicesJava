public class Aluno {

    String nome;
    double notasMatematica;
    double notasPortugues;
    double notasHistoria;
    


    Boletin mediaDeNotas() {

	Boletin notas = new Boletin();
	notas.matematica = this.notasMatematica;
	notas.portugues = this.notasPortugues;
	notas.historia = this.notasHistoria;

	
	 notas.resultado = (notas.matematica + notas.portugues + notas.historia) / 3; 

	

	return notas;

    }


}