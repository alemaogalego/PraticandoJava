package br.com.atividades.WhileeFor.modulo4;

import java.util.Scanner;

public class CalculadoraDeFatorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= valor; i++) {
            fatorial *= i;

            System.out.println(fatorial);
        }


    }
}
