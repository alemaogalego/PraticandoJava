package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo1;

public class Aluno  {
    private String nome;
    private String tipo;


    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void identificarAluno() {
        System.out.println("Aluno: " + this.nome + ", Tipo: " + this.tipo);
    }


}
