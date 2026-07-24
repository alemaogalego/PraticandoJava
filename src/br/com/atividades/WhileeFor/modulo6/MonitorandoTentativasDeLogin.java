package br.com.atividades.WhileeFor.modulo6;

import java.util.Scanner;

public class MonitorandoTentativasDeLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final String SENHACORRETA = "123";
        int senhaCorreta = 123;

        for (int tentativas = 3; tentativas > 0 ; tentativas--) {
            System.out.println("Digite sua senha: ");
            String senha = input.nextLine();


            if (senha.equals(SENHACORRETA)) {
                System.out.println("Senha correta!");
                break;
            }else if(tentativas > 1){
                System.out.println("Senha incorreta! Voce tem" + (tentativas - 1) + " tentativas!");
            }else {
                System.out.println("Conta Bloqueada");
            }

        }
//
        int tentativasMaxima = 3;
        int tentativas = 0;

        while(true){

            if(tentativas > tentativasMaxima){
                System.out.println("Conta Bloqueada");
                break;
            }
            System.out.println("Digite sua senha: ");
            int senha = input.nextInt();

            if (senha == senhaCorreta){
                System.out.println("senha correta! ");
                break;
            }else{
                System.out.println("senha incorreta! Tentativas restantes: " + (tentativasMaxima - tentativas) );
                tentativas++;
            }

        }









    }
}
