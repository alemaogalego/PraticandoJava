package br.com.atividades.ClassesAtributosEMetodos.modulo5;

public class Alunos {

    private String nome;
    private float nota;
    private float nota2;


    public Alunos(String nome, float nota, float nota2) {
        this.nome = nome;
        this.nota = nota;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void calcularMedia() {
        float media = (nota + nota2) / 2;
        System.out.printf("Aluno: %s \n", nome);
        System.out.printf("Nota 1: %.2f \n", nota);
        System.out.printf("Nota 2: %.2f \n", nota2);
        System.out.printf("A media do aluno é: %.1f \n", media);

        if(media >= 7) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }

    }

}
