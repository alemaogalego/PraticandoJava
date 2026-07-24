package br.com.atividades.WhileeFor.modulo3;

public class SomaDosNumerosPares {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println(soma);




    }
}
