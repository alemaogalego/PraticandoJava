package br.com.atividades.Streams.modulo9;

import br.com.atividades.Streams.modulo8.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        List<Produto> produtosMaisBaratos = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos")) // Filtrar pela categoria
                .filter(p -> p.getPreco() < 1000)                   // Filtrar pelo preço
                .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())) // Ordenar pelo preço
                .limit(3)                                           // Pegar os 3 primeiros
                .collect(Collectors.toList());                     // Coletar em uma lista

        System.out.println(produtosMaisBaratos);
    }
}