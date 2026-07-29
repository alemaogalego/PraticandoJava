package br.com.atividades.ClassesAtributosEMetodos.modulo6;

public class Colaborador {
    private String nome;
    private String cargo;
    private int nivelAcesso;


    public Colaborador(String nome, String cargo, int nivelAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }


    public void exibirInformacoes(){
        System.out.println("--- Informaçoes do Colaborador ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nível de Acesso: " + nivelAcesso);
    }

    public void promoverFuncionario (String novoCargo, int novoNivelAcesso){
        this.cargo = novoCargo;
        this.nivelAcesso = novoNivelAcesso;

        System.out.println("--- Apos atualização ---");
        exibirInformacoes();
    }
}
