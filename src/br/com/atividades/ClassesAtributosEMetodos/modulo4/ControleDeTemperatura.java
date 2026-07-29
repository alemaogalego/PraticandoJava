package br.com.atividades.ClassesAtributosEMetodos.modulo4;

import java.util.Scanner;

public class ControleDeTemperatura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma temperatura: ");
        float temperatura = input.nextFloat();
        input.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite o local: ");
        String local = input.nextLine();

        Temperatura t = new Temperatura(temperatura, local);


        t.verificarTemperatura();

        input.close();

    }
}
