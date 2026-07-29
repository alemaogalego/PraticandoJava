package br.com.atividades.ClassesAtributosEMetodos.modulo7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleDeTarefas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Tarefa> tarefas = new ArrayList<>();

//        for (int qtdTarefa = 0; qtdTarefa < 2; qtdTarefa++) {
//            System.out.println("Digite o nome da tarefa: ");
//            String nomeTarefa = input.nextLine();
//            System.out.println("Digite o status da tarefa (true para concluída, false para pendente): ");
//            boolean statusTarefa = input.nextBoolean();
//            input.nextLine(); // Limpar o buffer do scanner
//
//            tarefas.add(new Tarefa(nomeTarefa, statusTarefa));
//        }

        while (true) {

            System.out.println("1- Adicionar Tarefa, 2-Listar Tarefas, 3-Sair");
            int opcao = input.nextInt();
            input.nextLine(); // Limpar o buffer do scanner

            if (opcao == 1) {
                System.out.println("Digite o nome da tarefa: ");
                String nomeTarefa = input.nextLine();
                System.out.println("Digite o status da tarefa (true para concluída, false para pendente): ");
                boolean statusTarefa = input.nextBoolean();
                input.nextLine(); // Limpar o buffer do scanner
                tarefas.add(new Tarefa(nomeTarefa, statusTarefa));
            }else if (opcao == 2) {
                for (Tarefa tarefa : tarefas) {
                    tarefa.exibirTarefa();
                }
            }else if (opcao == 3) {
                break;
            }else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    input.close();
    }

}
