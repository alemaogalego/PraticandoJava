package br.com.atividades.DataEHora.modulo11;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Text {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("HH:mm");
        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(input.next(), formatar);

        System.out.println("Digite a carga horária diária (em horas)");
        int cargaHoraria = input.nextInt();

        System.out.println("Digite o horário real de saída (HH:mm):");
        LocalTime saida = LocalTime.parse(input.next(), formatar);

        input.close();

        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

        Duration duracao = Duration.between(saidaPrevista, saida);
        long horaExtras = duracao.toHours();
        long minutosExtras = duracao.toMinutesPart();

        System.out.println("\nHorário de entrada: " + entrada.format(formatar));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatar));
        System.out.println("Horário real de saída: " + saida.format(formatar));


        if (horaExtras == 0 && minutosExtras == 0){
            System.out.println("Saldo de horas: 0h 0min");
        } else{
            String sinal;

            if (horaExtras > 0 || minutosExtras > 0){
                sinal = "+";
            } else {
                sinal = "-";
            }
            System.out.println("Saldo de horas: " + sinal + Math.abs(horaExtras) + "h " + Math.abs(minutosExtras) + "min");

        }


    }

}
