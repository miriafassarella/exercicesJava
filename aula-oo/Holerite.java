public class Holerite {

    Funcionario funcionario;
    double valorTotalHNormais;
    double valorTotalHExtras;
    double valorAdicionalFilhos;
    double salario;

    public void calcularValorTotal(double qHNormais, double qHExtras, double valorHNormais, double valorHExtras){
	
	this.valorTotalHNormais = qHNormais * valorHNormais;
	this.valorTotalHExtras = qHExtras * valorHExtras;

	salario = valorTotalHNormais + valorTotalHExtras;

		
    }

    public void imprimir() {

	System.out.println("Calculo do salário de " + this.funcionario.nome + " :");
	System.out.printf("Valor à receber referente às horas normais trabalhadas: %.2f%n", this.valorTotalHNormais);
	System.out.printf("Valor à receber referente às horas extras trabalhadas: %.2f%n", valorTotalHExtras);
	System.out.printf("%s tem filhos? %b%n", funcionario.nome, funcionario.temFilhos());
	System.out.printf("%s receberá o salário de %.2f%n", funcionario.nome, salario);
	
 }
    
}