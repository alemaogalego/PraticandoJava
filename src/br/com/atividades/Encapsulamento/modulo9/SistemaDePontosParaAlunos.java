package br.com.atividades.Encapsulamento.modulo9;

public class SistemaDePontosParaAlunos {
    static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");

        aluno1.ganharPontos(100);
        aluno2.ganharPontos(99);


        aluno1.ganharPontos(200);

        aluno1.exibirStatus();
        aluno2.exibirStatus();




    }
}
