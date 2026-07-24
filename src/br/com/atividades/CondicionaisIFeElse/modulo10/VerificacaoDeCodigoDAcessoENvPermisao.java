package br.com.atividades.CondicionaisIFeElse.modulo10;


import java.util.Scanner;

public class VerificacaoDeCodigoDAcessoENvPermisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu acesso: ");
        int acesso = sc.nextInt();

        System.out.println("digite seu nivel de permissao: ");
        int permissao = sc.nextInt();

        int senhaAcesso = 2023;

        int nivelPermissaoMinima = 1;
        int nivelPermissaoMaxima = 3;

        boolean acessoValido = acesso == senhaAcesso;
        boolean permissaoValido = permissao >= nivelPermissaoMinima && permissao <= nivelPermissaoMaxima;

        if (acessoValido && permissaoValido) {
            System.out.println("Acesso Valido, Entro no sistema!");
        }else  {
            System.out.println("Acesso Invalido, \nMotivo:");
            if(!acessoValido){
                System.out.println("- Acesso invalido, senha incorreta.");
            }
            if(!permissaoValido){
                System.out.println("- Acesso Invalido, permissao incorreta.");
            }
        }


    }

}
