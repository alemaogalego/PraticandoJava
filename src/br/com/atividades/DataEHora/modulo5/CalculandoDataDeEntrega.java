package br.com.atividades.DataEHora.modulo5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CalculandoDataDeEntrega {

    static void main(String[] args) {

        LocalDate dataInicio = LocalDate.now();
        int prazoDias = 15;
        LocalDate dataInicial = dataInicio.plusDays(prazoDias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataInicial.format(formatter);

        System.out.println("Data de entrega: " + dataFormatada);





    }



}
