package br.com.atividades.Lambda.modulo3;

public class TransformarLetraMaiuscula {
    static void main(String[] args) {
        Transformador toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.transformar("exemplo de string"));
    }
}
