package br.com.atividades.ClassesAtributosEMetodos.modulo6;

import java.util.Scanner;

public class CorrigindoCadastro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu cargo: ");
        String cargo = input.nextLine();

        System.out.println("Digite seu nível de acesso: ");
        int nivelAcesso = input.nextInt();
        input.nextLine(); // Limpar o buffer do scanner

        Colaborador usuario1 = new Colaborador(nome, cargo, nivelAcesso);

        usuario1.exibirInformacoes();

        usuario1.promoverFuncionario("dev Senior", 2);

        input.close();
    }
}
