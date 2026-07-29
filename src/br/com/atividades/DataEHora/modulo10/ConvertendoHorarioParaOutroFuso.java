package br.com.atividades.DataEHora.modulo10;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConvertendoHorarioParaOutroFuso {
    static void main(String[] args) {

        ZonedDateTime horarioSistema = ZonedDateTime.now();

        ZonedDateTime horarioSydney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("HH:mm");
        String horaAtualFormatada = formatar.format(horarioSistema);
        String horaSydneyFormatada = formatar.format(horarioSydney);



        System.out.println("Horario atual no sistema: " + horaAtualFormatada);
        System.out.println("Horario atual em Sydney: " + horaSydneyFormatada);


    }
}
