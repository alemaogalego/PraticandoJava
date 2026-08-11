package br.com.atividades.ColecoesEStreams.modulo8;

import java.util.List;

public class CalculandoQuadradoDosNumeros {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> quadrados = numeros.stream()
                .map(numero -> numero * numero)
                .toList();
        System.out.println(quadrados);

    }
}
