public class FormatandoComPrintf {

    public static void main(String[] args) {
    String nome1 = "Miriã";

    System.out.printf("Olá, %s%n", nome1);

    int quantidade = 48;

    System.out.printf("Quantidade: %d itens%n", quantidade);


    double peso = 938.22;
    System.out.printf("Peso: %.2f", peso);//o .2 defice a quantidade de casas decimais.
    
    System.out.printf("Peso: %10.2f", peso);//aceita no maximo 10 caracteres antes do ponto.
    }


}