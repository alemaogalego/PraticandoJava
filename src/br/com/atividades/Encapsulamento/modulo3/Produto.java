package br.com.atividades.Encapsulamento.modulo3;

public class Produto {
    private String nome;
    private double preco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double valor) {
        if (valor >= 0) {
            this.preco = valor;
        }else {
            System.out.println("Preço inválido.");
        }
    }


}
