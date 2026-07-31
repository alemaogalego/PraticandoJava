package br.com.atividades.Encapsulamento.modulo3;

public class CadastroDeProdutosComValidacao {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setNome("Mouse");
        p1.setPreco(58.00);


        System.out.printf("Produto: %s \nPreço: %.2f", p1.getNome(), p1.getPreco());

    }
}
