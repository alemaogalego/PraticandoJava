package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo3;

public class Ebook extends Midia{
    private String formato;


    public Ebook(String titulo, int anoDePublicacao, String formato) {
        super(titulo, anoDePublicacao);
        this.formato = formato;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nCódigo:" + gerarLib(getTitulo(), getAnoDePublicacao()) + "|" + "Ebook:" + getTitulo() + "|" + "Formato:" + formato);
    }
}
