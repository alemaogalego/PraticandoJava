package br.com.atividades.DataEHora.modulo8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembreteDePagamento {
    static void main(String[] args) {

        LocalDate dataLembrete = LocalDate.of(2026, 03, 30);

        int prazoAntecedencia = 5;

        LocalDate dataDoLembrete = dataLembrete.minusDays(prazoAntecedencia);

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatar.format(dataDoLembrete);


        System.out.println("Data do lembrete: " + dataFormatada);



    }
}
