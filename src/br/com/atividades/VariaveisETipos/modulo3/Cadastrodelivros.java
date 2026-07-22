package br.com.atividades.VariaveisETipos.modulo3;

public class Cadastrodelivros {

    public static void main(String[] args) {

        String titulo = "O Pequeno Principe";
        String autor = "Antoine de Saint-Exupéry";
        int paginas = 7;
        double preco = 29.00;

        char categoria = 'F';

        String categoriaDescricao;

        if (categoria == 'F') {
            categoriaDescricao = "ficcao";
        }else if (categoria == 'N') {
            categoriaDescricao = "nao ficcao";
        } else if (categoria == 'M') {
            categoriaDescricao = "misterio";
        } else if (categoria == 'R') {
            categoriaDescricao = "romance";
        } else {
            categoriaDescricao = "categoria desconhecida";
        }
        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + paginas + " páginas, custa R$" + preco + " e pertence à categoria " + categoriaDescricao + ".");

    }


}
