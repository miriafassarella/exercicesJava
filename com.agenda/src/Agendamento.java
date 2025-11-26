public class Agendamento {

    private final Horario horario;

    private String descricao;


    public Agendamento(Horario horario, String descricao){
        /*Aqui estamos criado a copia defenciva*/
        this.horario = new Horario(horario.getHora(), horario.getMinuto());
        this.descricao = descricao;

    }

    public Horario getHorario() {
        /*Aqui estamos criado a copia defenciva*/
        return new Horario(horario.getHora(), horario.getMinuto());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorarioFormat() {
        return horario.format();
    }
}
