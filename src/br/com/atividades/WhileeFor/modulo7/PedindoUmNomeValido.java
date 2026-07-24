package br.com.atividades.WhileeFor.modulo7;

import java.util.Scanner;

public class PedindoUmNomeValido {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        while(true){
            System.out.println("Digite seu nome: ");
            String nome = input.nextLine();

            if(nome.length()< 3){
                System.out.println("Nome invalido. Digite novamente");
            } else {
                System.out.println("Nome: " + nome + " Cadastrado com sucesso!");
                break;
            }
            input.close();
        }




    }
}
