package br.com.atividades.ClassesAtributosEMetodos.modulo7;

public class Tarefa {
    private String descricao;
    private boolean status;


    public Tarefa(String descricao, boolean status) {
        this.descricao = descricao;
        this.status = status;
    }

    public void exibirTarefa() {
        System.out.println("Descrição: " + descricao + " - Status: " + (status ? "Concluída" : "Pendente"));
    }
}
