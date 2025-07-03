public class Paciente {

    double peso;
    double altura;


    IndiceMassaCorporal calcularIdiceMassaCorporal() {

    	IndiceMassaCorporal imc = new IndiceMassaCorporal();
	imc.resultado = this.peso / (this.altura * this.altura);
	imc.peso = this.peso;
	imc.altura = this.altura;
	
	return imc;

    }


}