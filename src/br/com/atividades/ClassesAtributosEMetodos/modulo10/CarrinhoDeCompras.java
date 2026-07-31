package br.com.atividades.ClassesAtributosEMetodos.modulo10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<ItemCarrinho> carrinho = new ArrayList<>();
        boolean iniciarPrograma = true;

        while (iniciarPrograma) {
            System.out.println("Bem-vindo ao Carrinho de Compras!");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Exibir o total da compra");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    scanner.nextLine(); // Limpar o buffer
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do item: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Digite a quantidade do item: ");
                    int quantidade = scanner.nextInt();

                    carrinho.add(new ItemCarrinho(nome, preco, quantidade));
                    break;
                case 2:
                    System.out.println("Digite o indice que deseja remover: ");
                    int indice = scanner.nextInt();
                    if(indice < 0 || indice >= carrinho.size()) {
                        System.out.println("Nenhum item encontrado!");
                    } else {
                        carrinho.remove(indice);
                    }
                    break;
                case 3:
                    double total = 0;
                    for (ItemCarrinho item : carrinho) {
                        total += item.getPreco() * item.getQuantidade();
                    }
                    System.out.printf("O total da compra é: R$%.2f%n", total);
                    break;
                case 4:
                    iniciarPrograma = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
