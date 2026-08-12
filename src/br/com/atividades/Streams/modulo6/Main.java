package br.com.atividades.Streams.modulo6;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("João", 22),
                new Pessoa("Maria", 17),
                new Pessoa("Pedro", 35)
        );

        pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .map(Pessoa::getNome)
                .sorted()
                .forEach(System.out::println);

    }
}
