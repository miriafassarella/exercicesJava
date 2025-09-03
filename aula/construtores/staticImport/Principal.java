
import com.mat.matematica.CalculadoraArea;

//importando diretamente o método.
//import static com.mat.matematica.CalculadoraArea.calcularAreaQuadrado;

//importando todos os métodos de uma vez.
import static com.mat.matematica.CalculadoraArea.*;


public class Principal {

    public static void main(String[] args) {
	
	double areaQuadrado = calcularAreaQuadrado(5.2);
	double areaCirculo = CalculadoraArea.calcularArealCirculo(10.5);
	
	System.out.println(areaQuadrado);
	System.out.print(areaCirculo);
    }

}