package br.com.atividades.StreamsComEstatisticas.modulo1;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
//1 - Dada a lista de números inteiros a seguir, encontre o maior número dela.

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> maiorNumero = numeros.stream().max(Integer::compareTo);
        System.out.println(maiorNumero.get());
    }
}