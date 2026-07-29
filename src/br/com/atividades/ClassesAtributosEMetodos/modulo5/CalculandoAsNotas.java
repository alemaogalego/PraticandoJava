package br.com.atividades.ClassesAtributosEMetodos.modulo5;

import java.util.Scanner;

public class CalculandoAsNotas {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = input.nextLine();

        System.out.printf("Digite a primeira nota do aluno: ");
        float nota1 = input.nextFloat();
        System.out.printf("Digite a segunda nota do aluno: ");
        float nota2 = input.nextFloat();

        Alunos aluno1 = new Alunos(nomeAluno, nota1, nota2);

        input.close();
        aluno1.calcularMedia();

    }
}
