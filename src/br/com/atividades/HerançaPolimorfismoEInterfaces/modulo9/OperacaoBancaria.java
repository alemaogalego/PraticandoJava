package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo9;

abstract class OperacaoBancaria implements AcaoBancaria {
    protected double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }

    public static class Deposito extends OperacaoBancaria {
        public Deposito(double valor) {
            super(valor);
        }

        @Override
        public void executar() {
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        }
    }

    public static class Saque extends OperacaoBancaria {
        public Saque(double valor) {
            super(valor);
        }
        @Override
        public void executar() {
            System.out.printf("Saque de R$%.2f realizado com sucesso.%n", valor);
        }
    }
}