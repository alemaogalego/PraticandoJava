package br.com.atividades.WhileeFor.modulo5;

import java.util.Arrays;
import java.util.Scanner;

public class EncontrandoOMaiorNumero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite os numeros em espaços: ");
        String [] numerosStr = input.nextLine().split(" ");

        int maior = Integer.MIN_VALUE;

        System.out.println(Arrays.toString(numerosStr));

        for (String numero : numerosStr) {
            int num = Integer.parseInt(numero);
            if(num > maior )
                maior = num;

        }

        System.out.println(maior);
    }
}
