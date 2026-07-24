package br.com.atividades.WhileeFor.modulo1;

import java.util.Scanner;

public class ContagemdeDeGraus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor do grau: ");
        int checagem = sc.nextInt();



       for (int i = 1; i <= checagem; i++) {
           System.out.println("Contagem de graus: " + i );


       }




        int j = 1;
        while(j <= checagem){
            System.out.println("Contagem de grau: " + j);
            j++;
        }
        boolean x = j <= checagem ;

        System.out.println(x);
    }
}
