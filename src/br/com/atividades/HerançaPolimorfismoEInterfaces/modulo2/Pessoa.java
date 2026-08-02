package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo2;

public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes(){
        System.out.printf("Aluno: %s, Idade: %d ", nome, idade);
    }


}
