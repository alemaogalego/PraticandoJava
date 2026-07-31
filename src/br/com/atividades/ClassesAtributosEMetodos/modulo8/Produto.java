package br.com.atividades.ClassesAtributosEMetodos.modulo8;

public class Produto {
    private String nome;
    private int quantidade;


    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void realizarVenda(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            System.out.printf("Venda Realizada. Estoque restante de %s: %d %n", nome, quantidade);
        } else {
            System.out.println("Quantidade insuficiente em estoque para realizar a venda.");
        }

    }
}
