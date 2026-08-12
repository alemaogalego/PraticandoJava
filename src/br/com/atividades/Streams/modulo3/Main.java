package br.com.atividades.Streams.modulo3;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5);


        List<Integer> resultado = lista.stream()
                    .filter(n -> n % 2 == 1)
                    .map(m -> m * 2)
                    .collect(Collectors.toList())        ;
        System.out.println(resultado);
    }
}
