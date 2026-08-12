package br.com.atividades.Streams.modulo4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        List<String> certas = palavras.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(certas);
    }
}
