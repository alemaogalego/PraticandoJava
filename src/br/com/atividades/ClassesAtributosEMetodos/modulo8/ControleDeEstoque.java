package br.com.atividades.ClassesAtributosEMetodos.modulo8;

import java.util.Scanner;

public class ControleDeEstoque {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = input.nextLine();
        System.out.println("Digite a quantidade em estoque: ");
        int quantidade = input.nextInt();

        Produto produto = new Produto(nome, quantidade);
        produto.realizarVenda(5);
        input.close();
    }
}
