package br.com.atividades.DataEHora.modulo6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjustandoDataDeVencimento {
    public static void main(String[] args) {

        LocalDate dataVencimento = LocalDate.of(2025, 03, 20);
        int adiantamentoUmMes = 1;
        LocalDate dataVencimentoNova = dataVencimento.plusMonths(adiantamentoUmMes);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataVencimentoNova.format(formatter);


        System.out.println("Nova Data de vencimento: " + dataFormatada);



    }
}
