package br.com.atividades.Encapsulamento.modulo6;

public class Conta {
    private String nome;
    private double saldo;


    public Conta(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.printf("Depósito de %.2f realizado com sucesso.\n", valor);

        } else {
            System.out.println("Valor inválido para depósito.");
        }

    }
    public void exibirSaldo(){
        System.out.printf("Saldo atual de %s: %.2f\n", nome, saldo);
    }

    public void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            System.out.printf("Saque de %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

}
