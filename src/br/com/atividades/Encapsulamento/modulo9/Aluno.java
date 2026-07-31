package br.com.atividades.Encapsulamento.modulo9;

public class Aluno {
    private String nome;
    private double pontos = 0;
    private int nivel = 1;


    public Aluno(String nome) {
        this.nome = nome;
    }

    public void ganharPontos(double qtdPontos){
        this.pontos += qtdPontos;
        atualizarNivel();
    }

    public void atualizarNivel(){
        this.nivel = (int) (pontos / 100) + 1;
    }


    public void exibirStatus(){
        System.out.println("Aluno: " + this.nome + ", Pontos: " + this.pontos + ", Nível: " + this.nivel);
    }

}