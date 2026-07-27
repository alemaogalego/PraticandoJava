package br.com.atividades.DataEHora.modulo7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class VerificandoDataDeUmEvento {
    static void main(String[] args) {

        LocalDate dataEvento = LocalDate.of(2026, 07, 25);
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataEventoFormatada = dataEvento.format(formatter);
        String dataAtualFormatada = dataAtual.format(formatter);


        Period period = Period.between(dataAtual, dataEvento);
        String diasFaltando = period.getDays() + " dias";

        Period period2 = Period.between(dataEvento, dataAtual);
        String diasPassados = period2.getDays() + " dias atras";


        if(dataEvento.isBefore(dataAtual)) {
            //minusDays para calcular a data.
            LocalDate dataCalculada = dataAtual.minusDays(period2.getDays());
            String dataCalculadaFormatada = dataCalculada.format(formatter);


            System.out.println("O evento ja ocorreu foi " + diasPassados);
            System.out.println("O evento já ocorreu em: " + dataCalculada.format(formatter));

        } else if (dataEvento.equals(dataAtual)) {
            System.out.println("O evento é hoje");

        } else {
            System.out.println("O evento nao ocorreu faltando: " + diasFaltando);
        }

    }



}
