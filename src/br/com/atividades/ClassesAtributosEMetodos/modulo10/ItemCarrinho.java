package br.com.atividades.ClassesAtributosEMetodos.modulo10;

public class ItemCarrinho {
    private String nome;
    private double preco;
    private int quantidade;

    public ItemCarrinho(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void valorTotal() {
        double total = preco * quantidade;
        System.out.println("Valor total do item " + nome + ": R$" + total);
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
