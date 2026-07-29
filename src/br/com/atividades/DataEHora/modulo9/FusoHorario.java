package br.com.atividades.DataEHora.modulo9;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    static void main(String[] args) {

        ZonedDateTime horarioTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaTokyoFormatada = formatar.format(horarioTokyo);


        System.out.println("Horario atual em Toquio: " + horaTokyoFormatada);




    }
}
