package br.com.atividades.StreamsComEstatisticas.modulo4;


import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // código da filtragem e agrupamento dos dados
        int somaDosQuadrados = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .reduce(0, Integer::sum);

        System.out.println(somaDosQuadrados); // Resultado Esperado: 56

    }
}