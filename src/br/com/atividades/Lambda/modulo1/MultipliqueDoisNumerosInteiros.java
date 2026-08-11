package br.com.atividades.Lambda.modulo1;

public class MultipliqueDoisNumerosInteiros {
    static void main(String[] args) {


        Multiplicacao multiplicacao = (a, b) -> a * b;
        int resultado = multiplicacao.multiplicacao(5, 3);
        System.out.println("O resultado da multiplicação é: " + resultado);
    }
}
