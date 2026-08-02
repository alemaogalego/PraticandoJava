package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo3;

public class Principal {
    static void main(String[] args) {

        Livro livro1 = new Livro("O Senhor dos Anéis", 1954, "J.R.R. Tolkien");
        Revista revista1 = new Revista("National Geographic", 2023, 5);
        Ebook ebook1 = new Ebook("Clean Code", 2008, "PDF");


        livro1.exibirInformacoes();
        revista1.exibirInformacoes();
        ebook1.exibirInformacoes();
    }
}
