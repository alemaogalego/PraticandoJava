package br.com.atividades.Streams.modulo2;

import java.util.Arrays;
import java.util.List;

///2 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.

public class Main {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList(
            "Java", "Python", "JavaScript", "C#", "C++", "Ruby", "Go", "Swift"
        );


        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
