package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo1;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "regular");
        Bolsista bolsista1 = new Bolsista("Maria");


        aluno1.identificarAluno();
        bolsista1.identificarAluno();
    }

}
