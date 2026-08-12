package br.com.atividades.Lambda.modulo8;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<String> nomes = Arrays.asList("João", "Maria", "José", "Ana", "Pedro");

        nomes.stream()
                .sorted()
                .limit(3)
                .filter(nome -> nome.startsWith("J"))
                .map(nome -> nome.toUpperCase())
                .forEach(nome -> System.out.println(nome));


    }
}
