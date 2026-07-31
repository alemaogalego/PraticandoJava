package br.com.atividades.Encapsulamento.modulo6;

public class ControleDeSaldoBancario {
    static void main(String[] args) {


        Conta user1 = new Conta("João");
        user1.depositar(150.0);
        user1.sacar(55.0);

        user1.exibirSaldo();
    }
}
