package br.com.atividades.DataEHora.modulo11;


import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleDeExpediente {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime horarioEntrada = LocalTime.parse(input.next(), formatar);

        System.out.println("Digite a carga horária diária (em horas): ");
        int cargaHoraria = input.nextInt();

        System.out.println("Digite o horário real de saída (HH:mm): ");
        LocalTime horarioSaida = LocalTime.parse(input.next(), formatar);

        input.close();

        LocalTime saidaPrevista = horarioEntrada.plusHours(cargaHoraria);

        Duration diferenca = Duration.between(saidaPrevista, horarioSaida);
        long horasExtras = diferenca.toHours();
        long minutoExtras = diferenca.toMinutesPart();


        System.out.println("\nHorário de entrada: " + horarioEntrada.format(formatar));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatar));
        System.out.println("Horário real de saída: " + horarioSaida.format(formatar));

        if (horasExtras == 0 && minutoExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if (horasExtras > 0 || minutoExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutoExtras) + "min");
        }

    }
}
