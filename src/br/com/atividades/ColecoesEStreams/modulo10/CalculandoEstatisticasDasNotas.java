package br.com.atividades.ColecoesEStreams.modulo10;

import java.util.List;

public class CalculandoEstatisticasDasNotas {

    static void main(String[] args) {

        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double valorMinimo = notas.stream().min(Double::compare).orElseThrow();
        double valorMaximo = notas.stream().max(Double::compare).orElseThrow();
        double valorMedio = notas.stream().mapToDouble(Double::doubleValue).average().orElseThrow();

        System.out.println("Valor medio: " + valorMedio);
        System.out.println("Valor mínimo: " + valorMinimo);
        System.out.println("Valor maximo: " + valorMaximo);

    }
}
