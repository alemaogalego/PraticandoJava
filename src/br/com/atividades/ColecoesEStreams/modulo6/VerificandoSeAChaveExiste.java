package br.com.atividades.ColecoesEStreams.modulo6;

import java.util.Map;

public class VerificandoSeAChaveExiste {

    static void main(String[] args) {



        Map<Integer, String> clientes = new java.util.HashMap<>();
        clientes.put(1, "Pedro");
        clientes.put(2, "Maria");
        clientes.put(3, "Rodrigo");
        clientes.put(4, "João");

        int idCliente = 3;

        if (clientes.containsKey(idCliente)) {
            String nomeCliente = clientes.get(idCliente);
            System.out.println("O nome do cliente com id " + idCliente + " é: " + nomeCliente);
        } else {
            System.out.println("O cliente com id " + idCliente + " não existe.");
        }




    }
}
