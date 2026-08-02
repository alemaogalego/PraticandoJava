package br.com.atividades.Encapsulamento.modulo10;

public class RegistroDeNotas {
    static void main(String[] args) {


        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarNota(8.5);
        matematica.adicionarNota(9.0);
        matematica.adicionarNota(11.0); // Nota inválida
        matematica.adicionarNota(7.5);


        System.out.println("Quantidade de notas válidas: " + matematica.contarNotasValidas());
        System.out.printf("Média das notas: %.2f%n", matematica.calcularMedia());



    }
}
