package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo5;

public class CartaoCredito extends Pagamento{

    public CartaoCredito(double valor) {
        super(valor);
    }


    @Override
    public void confirmarPagamento() {
        double valorDeTaxa = getValor() * 0.03; // 3% de taxa
        System.out.printf("Pagamento de R$ %.2f realizado com cartão de crédito.\n", getValor());
        System.out.printf("Taxa de 3%% aplicada: R$ %.2f\n", valorDeTaxa);
    }
}
