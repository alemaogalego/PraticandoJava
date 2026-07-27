package br.com.atividades.WhileeFor.modulo10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDeControleDeAcessoAConvidados {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> listaMembros = new ArrayList<>();

        while(true){

            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar)");
            String nome = input.nextLine().toLowerCase();

            if (nome.equals("sair")){
                break;
            }else if(nome.equals("ver")){
                System.out.println(listaMembros);
                continue;
            }
            if (listaMembros.contains(nome)){
                System.out.println("nome ja existe");
                continue;

            }

            listaMembros.add(nome);

        }




    }
}
