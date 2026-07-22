package br.com.atividades.CondicionaisIFeElse.modulo5;

import java.util.Scanner;

public class VerificacaoDeDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        if(valor >= 100){

            double valorDesconto = valor * 0.10;
            double valorFinal = valor - valorDesconto;
            System.out.println("O valor da compra é: " + valor);
            System.out.println("O desconto aplicado é de 10%: " + valorDesconto);
            System.out.println("O preço final com desconto é: " + valorFinal);

        } else {
            System.out.println("O valor da compra é: " + valor);
            System.out.println("Não há desconto aplicado.");
            System.out.println("O preço final é: " + valor);
        }
        sc.close();

    }
}
