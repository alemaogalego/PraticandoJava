package br.com.atividades.ColecoesEStreams.modulo3;

import java.util.ArrayList;
import java.util.List;

public class AcessandoElementos {

    static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("abacaxi");
        lista.add("morango");
        lista.add("cenoura");


        System.out.println("Segundo elemento: " + lista.get(1));
        System.out.println("Total de items: " + lista.size());

    }
}
