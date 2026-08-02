package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo5;

public class Principal {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito(250.0);
        Pagamento boleto = new Boleto(500.0);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
    }
}
