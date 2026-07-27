package br.com.atividades.DataEHora.modulo1;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Data {
    static void main(String[] args) {


        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2026, 7, 27);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);


        //Manipular para verificar se antes ou depois ou se estou no msm dia.
        if (dataPrimeiraParcela.isEqual(LocalDate.now())) {
            System.out.println("hj é o dia do vecimento");
        }else {
            System.out.println("Ainda nao esta no dia vencimento");
        }

        if (dataPrimeiraParcela.isBefore(LocalDate.now())) {
            System.out.println("Anterior ao dia do vecimento");
        }else {
            System.out.println("Superior ao dia vencimento");
        }


        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);

        //Formataçoes

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da compra: " + dataCompra.format(formato));

        //Para outros paises se eu estivese em NY.

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data da compra formatada: " + dataConclusaoCompra);
        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("Data da compra em NewYork: " + dataCompraNy);

        //Calculo de diferença entre data e hora ( Exemplo nosso horario de trabalho)

        LocalTime inicio = LocalTime.of(9,0);
        LocalTime fim = LocalTime.of(17,30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("A duraçao do expediente: " + duracao.toHours() + "Horas e " + duracao.toMinutesPart() +
                "Minutos e " + duracao.toSeconds() + " Segundos");

        //Verificaçao para datas

        LocalDate dataPagamento = LocalDate.parse("2026-10-30");
        Period period = Period.between(dataCompra, dataPagamento);

        System.out.println("Faltam " + period.getDays() + " dias" + " e " + period.getMonths() + " meses ");

    }
}
