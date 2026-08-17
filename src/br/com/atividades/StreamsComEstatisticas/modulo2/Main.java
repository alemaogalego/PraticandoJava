package br.com.atividades.StreamsComEstatisticas.modulo2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> palavrasPorTamanho = palavras.stream()
                .collect(java.util.stream.Collectors.groupingBy(String::length));

        System.out.println(palavrasPorTamanho);


    }
}