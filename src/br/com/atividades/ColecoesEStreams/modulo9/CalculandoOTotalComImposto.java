package br.com.atividades.ColecoesEStreams.modulo9;

import java.util.List;

public class CalculandoOTotalComImposto {

    public static void main(String[] args) {

        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double totalGasto = precosProdutos.stream().mapToDouble(Double::doubleValue).sum();

        double imposto = totalGasto * 0.08;
        double totalComImposto = totalGasto + imposto;

        System.out.println("Valor total antes do imposto: " + String.format("%.2f", totalGasto));
        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", totalComImposto));






    }
}

