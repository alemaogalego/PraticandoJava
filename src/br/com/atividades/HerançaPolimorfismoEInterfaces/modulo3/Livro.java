package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo3;

public class Livro extends Midia{
    private String autor;


    public Livro(String titulo, int anoDePublicacao, String autor) {
        super(titulo, anoDePublicacao);
        this.autor = autor;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nCódigo:" + gerarLib(getTitulo(), getAnoDePublicacao()) + "|" + "Livro:" + getTitulo() + "|" + "Autor:" + autor);
    }
}
