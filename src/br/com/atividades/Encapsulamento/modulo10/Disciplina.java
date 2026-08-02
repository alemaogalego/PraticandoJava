package br.com.atividades.Encapsulamento.modulo10;

import java.util.ArrayList;

public class Disciplina {
    private String materia;
    private ArrayList<Double> notas;


    public Disciplina(String materia) {
        this.materia = materia;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.notas.add(nota);
            System.out.printf("Nota adicionada: %.2f%n", nota);
        } else if (nota < 0 || nota > 10) {
            System.out.printf("Nota inválida ignorada: %.2f%n", nota);

        }
    }

    public int contarNotasValidas() {
        return notas.size();
    }

    public double calcularMedia() {
        if(notas.isEmpty()){
            return 0;
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

}
