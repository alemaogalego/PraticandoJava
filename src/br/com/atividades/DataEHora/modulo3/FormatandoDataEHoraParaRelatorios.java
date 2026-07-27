package br.com.atividades.DataEHora.modulo3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatandoDataEHoraParaRelatorios {
    static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();


        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formatar2 = DateTimeFormatter.ofPattern("HH:mm");

        //Caso precise usar em outro lugar
        String horaAtualFormatada = formatar2.format(horaAtual);


        System.out.println("Data atual formatada: " + dataAtual.format(formatar));
        System.out.println("Hora atual formatada: " + horaAtualFormatada);


    }
}
