package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo2;

public class Principal {
    static void main(String[] args) {


        Aluno aluno1 = new Aluno("João", 20, 8.5);
        Docente docente1 = new Docente("Maria", 35, "Matemática");


        aluno1.exibirInformacoes();
        docente1.exibirInformacoes();


    }
}
