package br.com.atividades.ColecoesEStreams.modulo2;

import java.util.ArrayList;
import java.util.List;

public class RemovendoElementos {

    static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Joao");
        lista.add("Pedro");
        lista.add("Maria");

        System.out.println("Lista de nomes: " + lista);

        lista.remove("Joao");
        System.out.println("Lista após a exclusão: " + lista);


    }
}
