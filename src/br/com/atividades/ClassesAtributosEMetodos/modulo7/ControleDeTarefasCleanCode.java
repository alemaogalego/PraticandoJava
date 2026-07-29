package br.com.atividades.ClassesAtributosEMetodos.modulo7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleDeTarefasCleanCode {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Tarefa> tarefas = new ArrayList<>();

        boolean programaRodando = true;


        while (programaRodando){
            System.out.println("-----Menu-----");
            System.out.println("1- Adicionar Tarefa");
            System.out.println("2- Listar Tarefas");
            System.out.println("3- Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do tarefa: ");
                    String nomeTarefa = input.nextLine();

                    System.out.println("Digite o status da tarefa (true para concluída, false para pendente): ");
                    boolean statusTarefa = input.nextBoolean();
                    input.nextLine();

                    tarefas.add(new Tarefa(nomeTarefa, statusTarefa));
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("\n--- LISTA DE TAREFAS ---");
                    for (Tarefa tarefa : tarefas) {
                        tarefa.exibirTarefa();
                    }
                    break;
                case 3:
                    programaRodando = false;
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        input.close();


    }
}
