//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*Vamos trabalhar com copias defencivas para impedir a alteração
     das propriedades da classe Horario*/
        Horario horario = new Horario(10, 30);


        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");
        agendamentoCabelo.getHorario().setHora(13);

        Agendamento agendamentoBarba = new Agendamento(horario, "Hidratação barba");

        agendamentoBarba.getHorario().setHora(11);
        agendamentoBarba.getHorario().setMinuto(20);
        imprimir(agendamentoCabelo);
        imprimir(agendamentoBarba);

    }

    private static void imprimir(Agendamento agendamento){
        System.out.printf("%s às %s%n", agendamento.getDescricao(), agendamento.getHorarioFormat());
    }
}