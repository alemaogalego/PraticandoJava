package br.com.atividades.Encapsulamento.modulo8;

import java.util.Scanner;

public class ValidacaoDeLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tentativas = 3;

        Usuario user1 = new Usuario("admin", "1234");

        while (tentativas > 0) {

            System.out.println("Digite o usuário: ");
            String usuario = input.nextLine();
            System.out.println("Digite o senha: ");
            String senha = input.nextLine();

            if(user1.validarLogin(usuario, senha)) {
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                tentativas--;
            }if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. Tente novamente mais tarde.");
            }else {
                System.out.println("Usuário ou senha incorretos. Você tem " + tentativas + " tentativas restantes.");
            }
        }
        input.close();
    }
}
