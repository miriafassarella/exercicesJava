public class PrincipalT {

    public static void main(String[] args) {
        Televisor tv = new Televisor();

        // Não deveria mudar o volume e canal
        tv.mudarVolume(20);
        tv.mudarCanal(130);

        // Deveria mudar o volume e canal
        tv.mudarVolume(300);
        tv.mudarCanal(10);


	Integer numero1 = 127;
	Integer numero2 = 127;

	System.out.println(numero1.compareTo(numero2) == 0);
    }

}