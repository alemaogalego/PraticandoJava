package br.com.atividades.ClassesAtributosEMetodos.modulo2;

public class Livro {
    String titulo;
    String autor;
    int paginas;



    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }


    public void exibirInformacoes(){
        System.out.println("--- DADOS DO LIVRO ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.paginas);


        System.out.println("--- DADOS DO LIVRO ---");
        System.out.printf("Título: %s \n", this.titulo);
        System.out.printf("Autor: %s \n", this.autor);
        System.out.printf("Páginas: %d \n", this.paginas);
    }
}
