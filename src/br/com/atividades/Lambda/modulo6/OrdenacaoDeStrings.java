package br.com.atividades.Lambda.modulo6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdenacaoDeStrings {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Lucas", "Maria", "Pedro", "Ana");
        nomes.sort((a, b) -> a.compareTo(b));
        System.out.println(nomes);
    }
}
