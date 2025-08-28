public class Main {

    public static void main(String[] args) {

	Paciente paciente = new Paciente();
	paciente.altura = 1.82;
	paciente.peso = 75;

	IndiceMassaCorporal imc = paciente.calcularIdiceMassaCorporal();



	System.out.printf("IMC: %.2f%n", imc.resultado);

   }


}