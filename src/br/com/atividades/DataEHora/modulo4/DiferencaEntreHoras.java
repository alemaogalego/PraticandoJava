package br.com.atividades.DataEHora.modulo4;

import java.time.Duration;
import java.time.LocalTime;

public class DiferencaEntreHoras {
    static void main(String[] args) {

        LocalTime horaInicial = LocalTime.of(14,30);
        LocalTime horaFinal = LocalTime.of(16,45);


        Duration diferenca = Duration.between(horaInicial, horaFinal);

        System.out.println("Diferenca de tempo: " + diferenca.toHours() + " horas e " + diferenca.toMinutesPart() + " minutos ");



    }
}
