public class VisitantePrincipal {

    public static void main(String[] args) {

	Visitante novoVisitante = new Visitante();
	novoVisitante.nome = "Miriã";
	novoVisitante.idade = 20;


	CadastroPortaria cadastroPortaria = new CadastroPortaria();
	cadastroPortaria.cadastrar(novoVisitante, 3);

	/*A variável final é uma constante e não permite alteração*/

    }

}