package br.com.atividades.DataEHora.modulo2;

import java.time.LocalDate;
import java.time.LocalTime;

public class DataEHoraAtual {
    static void main(String[] args) {

        LocalDate dataCriacao = LocalDate.now();
        LocalTime horaCriacao = LocalTime.now();

        String tarefa = "Enviar relatório semanal";

        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data de criação: " + dataCriacao);
        System.out.println("Hora de criação: " + horaCriacao);



    }


}
