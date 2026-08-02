package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo2;

public class Aluno extends Pessoa {
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nAluno: %s, Idade: %d, Nota: %.2f\n", nome, idade, nota);
    }
}
