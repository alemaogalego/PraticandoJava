package br.com.atividades.Encapsulamento.modulo7;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    ArrayList<Integer> avaliacoes = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }


    public Filme(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }


    public void adicionarAvaliacao(int nota) {
        if (nota >= 0 && nota <= 5) {
            avaliacoes.add(nota);
        }else{
            System.out.println("Nota inválida. A nota deve estar entre 0 e 5.");
        }
    }

    public double calcularMedia(){
        double soma = 0;
        for (int nota : avaliacoes) {
            soma += nota;
        }
        return (double) soma / avaliacoes.size();
    }
}
