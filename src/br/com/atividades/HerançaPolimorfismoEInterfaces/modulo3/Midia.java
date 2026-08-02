package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo3;


public class Midia {
    private String titulo;
    private int anoDePublicacao;


    public Midia(String titulo, int anoDePublicacao) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }



    public String gerarLib(String titulo, int anoDePublicacao) {

        return "LIB-" + titulo.substring(0, 3) + anoDePublicacao;
    }
    public void exibirInformacoes() {
        System.out.printf("Código:" + gerarLib(titulo, anoDePublicacao) + "|" + "Livro:" + titulo + "|" + "Ano de Publicação:" + anoDePublicacao);

    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
}
