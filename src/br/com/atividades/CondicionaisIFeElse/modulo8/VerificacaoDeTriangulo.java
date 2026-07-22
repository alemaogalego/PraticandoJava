package br.com.atividades.CondicionaisIFeElse.modulo8;

//Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo. Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado. Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.

//Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.


import java.util.Scanner;

public class VerificacaoDeTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado do triângulo:");
        int lado1 = sc.nextInt();
        System.out.println("Digite o valor do segundo lado do triângulo:");
        int lado2 = sc.nextInt();
        System.out.println("Digite o valor do terceiro lado do triângulo:");
        int lado3 = sc.nextInt();
        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            System.out.println("Os lados formam um triângulo.");
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
        sc.close();
    }
}
