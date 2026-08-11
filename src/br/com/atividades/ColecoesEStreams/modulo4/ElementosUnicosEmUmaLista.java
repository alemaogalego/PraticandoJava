package br.com.atividades.ColecoesEStreams.modulo4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementosUnicosEmUmaLista {

    public static void main(String[] args) {

        List<String> eventos = new ArrayList<>();
        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        Set<String> eventosSet = new HashSet<>(eventos);

        System.out.printf("Lista de eventos: %s\n", eventosSet);
    }
}
