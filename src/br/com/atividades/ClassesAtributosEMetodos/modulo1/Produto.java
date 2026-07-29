package br.com.atividades.ClassesAtributosEMetodos.modulo1;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;


    public void exibirInformacoes() {
        System.out.println("Nome do produto: " + nome);
        System.out.printf("Preço do produto: %f \n", preco);
        System.out.printf("Quantidade do produto: %d", quantidade);
    }
}
