package br.com.atividades.CondicionaisIFeElse.modulo1;

import java.util.Scanner;

public class VerificandoParOuImpar {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();


        if (valor % 2 == 0) {
            System.out.println("o numero" + valor + "é PAR.");

        }else {
            System.out.println("o numero" + valor + "é IMPAR.");
        }
        scanner.close();


    }
}
