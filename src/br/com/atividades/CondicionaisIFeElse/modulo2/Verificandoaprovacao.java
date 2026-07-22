package br.com.atividades.CondicionaisIFeElse.modulo2;

import java.util.Scanner;

public class Verificandoaprovacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a media: ");
        double media = sc.nextDouble();

        if (media >= 7.0){
            System.out.println("O aluno teve média " + media + " e foi aprovado.");
        }else if(media >= 5.0){
            System.out.println("O aluno teve média " + media + " e está em recuperação.");
        }else{
            System.out.println("O aluno teve média " + media + " e foi reprovado.");
        }

        sc.close();
    }
}
