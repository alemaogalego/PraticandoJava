package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo3;

public class Revista extends Midia {
    private int edicao;


    public Revista(String titulo, int anoDePublicacao, int edicao) {
        super(titulo, anoDePublicacao);
        this.edicao = edicao;
    }


    @Override
    public void exibirInformacoes() {
        System.out.printf("\nCódigo:" + gerarLib(getTitulo(), getAnoDePublicacao()) + "|" + "Revista:" + getTitulo() + "|" + "Edição:" + edicao);
    }
}
