import java.util.Objects;

public class Televisor {

    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {

	Objects.requireNonNull(novoCanal, "O canal não pode ser null");
	
        if (canal.equals(novoCanal)) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }

    void mudarVolume(Integer novoVolume) {

	Objects.requireNonNull(novoVolume, "O volume não pode ser null");
	
        if (volume.intValue() == novoVolume.intValue()) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = novoVolume;
            System.out.println("Volume alterado para " + volume);
        }
    }

}