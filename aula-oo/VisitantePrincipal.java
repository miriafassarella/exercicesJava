public class VisitantePrincipal {

    public static void main(String[] args) {

	Visitante novoVisitante = new Visitante();
	novoVisitante.nome = "Miriã";
	novoVisitante.idade = 20;


	if (novoVisitante.visitanteMaiorDeIdade()) {
	    
	    System.out.printf("Acesso não permitido para menores de %d anos !", Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO);

	}else {

	     System.out.printf("Acesso liberado !");

	}

	/*A variável final é uma constante e não permite alteração*/

    }

}