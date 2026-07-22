package br.com.atividades.CondicionaisIFeElse.modulo3;

import java.util.Scanner;

public class Validacaodesenha {
    public static void main(String[] args) {
        String senhaCorreta = "123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu senha: ");
        String tentativaSenha = sc.nextLine();

        if (tentativaSenha.equals(senhaCorreta)) {
            System.out.println("Senha correta! Acesso permitido.");
        } else {
            System.out.println("Senha incorreta! Acesso negado.");

        }
        sc.close();

    }
}
