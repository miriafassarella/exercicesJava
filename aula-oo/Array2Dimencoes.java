import java.util.Arrays;

public class Array2Dimencoes {

    public static void main(String[] args) {

	String[][] cidades = new String[3][3];
	cidades[0][0] = "Saint-Raymond";
	cidades[0][1] = "Sherbrooke";
	cidades[0][2] = "Magog";

	cidades[1][0] = "Donnacona";
	cidades[1][1] = "Sainte-Clair";
	cidades[1][2] = "Weedon";

	cidades[2][0] = "Vila-Velha";
	cidades[2][1] = "Guarapary";
	cidades[2][2] = "Marataízes";

	String[][][] bairros = new String[2][2][2];

	//Array com tamanho irregular

	String[][] nomes = new String[2][];
	nomes[0] = new String[2];
	nomes[1] = new String[3];

	nomes[0][0] = "Miriã";
	nomes[0][1] = "Adriano";

	nomes[1][0] = "Aline";
	nomes[1][1] = "Matheus";
	nomes[1][2] = "Milena";

	for (int i = 0; i < nomes.length; i++) {
		for (int j = 0; j < nomes[i].length; j++) {
			 System.out.println(nomes[i][j]);
		
			 //System.out.println(Arrays.toString(nomes[i]));
		}
	   

	}

	

	System.out.print(nomes[0][1]);

    }

}