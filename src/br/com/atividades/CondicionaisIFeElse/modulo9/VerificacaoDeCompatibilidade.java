package br.com.atividades.CondicionaisIFeElse.modulo9;

import java.util.Scanner;

public class VerificacaoDeCompatibilidade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade do doador:");
        int idade = sc.nextInt();
        System.out.println("Digite o peso do doador:");
        double peso = sc.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compatível para doar sangue.");

        }else {
            System.out.println("O doador não é compatível para doar sangue. \nMotivo:");
            if(!idadeValida){
                System.out.println("- Idade inválida. O doador deve ter entre 18 e 65 anos.");
            }
            if(!pesoValido){
                System.out.println("- Peso inválido. O doador deve pesar mais de 50 kg.");
            }
        }
        sc.close();
    }

}
