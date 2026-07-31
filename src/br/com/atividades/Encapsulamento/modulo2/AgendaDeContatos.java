package br.com.atividades.Encapsulamento.modulo2;

import java.util.ArrayList;

public class AgendaDeContatos {
    static void main(String[] args) {

        ArrayList<Contatos> contatos = new ArrayList<>();

        contatos.add(new Contatos("Lucas","(19)3233-4134"));
        contatos.add(new Contatos("Megan","(19)3555-4210"));
        contatos.add(new Contatos("Pereira","(19)3444-4234"));


        int indice = 0;
        for(Contatos contato : contatos) {
            indice++;

            System.out.println(indice + " - Nome: " + contato.getNome() + " - Telefone: " + contato.getTelefone());
        }

    }
}
