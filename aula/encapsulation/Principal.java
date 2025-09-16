public class Principal {

    public static void main(String[] args) {
	Carte mastercard = new Carte();
	mastercard.setTitulaire("Miriã");

	
	ServiceDepoPix serviceDepoPix = new ServiceDepoPix();

	serviceDepoPix.depot(mastercard, 200);

	System.out.println(mastercard.getTitulaire());
	System.out.print(mastercard.getSolde());

	

    }
}