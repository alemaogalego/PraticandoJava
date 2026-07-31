package br.com.atividades.ClassesAtributosEMetodos.modulo9;

import java.util.Scanner;

public class MultaPorAtraso {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o título do livro: ");
        String titulo = input.nextLine();
        System.out.println("Digite a quantidade de dias de atraso: ");
        int diasAtraso = input.nextInt();

        Multa multa = new Multa(titulo, diasAtraso);
        multa.calcularMulta();


    }
}
