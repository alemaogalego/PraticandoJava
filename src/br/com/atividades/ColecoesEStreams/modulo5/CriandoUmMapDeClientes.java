package br.com.atividades.ColecoesEStreams.modulo5;

import java.util.Map;

public class CriandoUmMapDeClientes {

    static void main(String[] args) {

        Map<Integer, String> clientes = new java.util.HashMap<>();

        clientes.put(1, "Pedro");
        clientes.put(2, "Maria");
        clientes.put(3, "Rodrigo");


        System.out.printf("O nome do cliente com id 2 é: %s\n", clientes.get(2));





    }

}
