public class Horario {

    private int hora;
    private int minuto;

    public Horario(int hora, int minuto){
        setHora(hora);
        setMinuto(minuto);

    }

    public String format(){
        return String.format("%dh:%dm", getHora(), getMinuto());
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {

        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora invalida: " + hora);
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {

        if (minuto > 59 || minuto < 0) {

            throw new IllegalArgumentException("Minuto invalido: " + minuto);
        }
        this.minuto = minuto;
    }



}
