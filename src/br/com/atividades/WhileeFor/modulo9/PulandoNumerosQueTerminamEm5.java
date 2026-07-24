package br.com.atividades.WhileeFor.modulo9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PulandoNumerosQueTerminamEm5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int nmr = input.nextInt();

        List<Integer> lista = new ArrayList<>();

        for (int numeros = 0; numeros < nmr; numeros++) {

            if (numeros % 10 == 5) {
                continue;
            }
            lista.add(numeros);
        }

        System.out.println(lista.toString());

    }
}
