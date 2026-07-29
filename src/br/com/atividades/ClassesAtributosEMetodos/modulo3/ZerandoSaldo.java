package br.com.atividades.ClassesAtributosEMetodos.modulo3;

import java.util.Scanner;

public class ZerandoSaldo {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu saldo: ");
        double saldo = input.nextFloat();

        Saldo saldo1 = new Saldo(saldo);

        saldo1.exibirSaldo();
        saldo1.zerarSaldo();
        saldo1.exibirSaldo();

        input.close();
    }
}
