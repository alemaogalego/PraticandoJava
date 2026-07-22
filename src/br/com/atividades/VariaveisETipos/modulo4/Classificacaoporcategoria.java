package br.com.atividades.VariaveisETipos.modulo4;

import static java.lang.IO.println;

public class Classificacaoporcategoria {

    public static void main(String[] args) {

        double preco = 150.00;

        String categoria;

        if (preco <= 50) {
            categoria = "Econômico";
            println("O produto pertence à categoria " + categoria + ".");

        }
        else if (preco >= 50 && preco <= 200) {
            categoria = "Intermediário";
            println("O produto pertence à categoria " + categoria + ".");

        } else {
            categoria = "Premium";
            println("O produto pertence à categoria " + categoria + ".");
        }
    }
}
