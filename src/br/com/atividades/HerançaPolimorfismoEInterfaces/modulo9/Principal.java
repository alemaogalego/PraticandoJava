package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo9;

public class Principal {

    public static void main(String[] args) {

        OperacaoBancaria deposito = new OperacaoBancaria.Deposito(200.0);
        OperacaoBancaria saque = new OperacaoBancaria.Saque(50.5);

        deposito.executar();
        saque.executar();

    }

}
