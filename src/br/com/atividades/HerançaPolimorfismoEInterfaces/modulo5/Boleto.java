package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo5;

public class Boleto extends Pagamento{

    public Boleto(double valor) {
        super(valor);
    }


    @Override
    public void confirmarPagamento() {
        double valorDeTaxa = getValor() * 0.01; // 2% de taxa
        System.out.printf("Pagamento de R$ %.2f realizado com boleto.\n", getValor());
        System.out.printf("Taxa de 1%% aplicada: R$ %.2f\n", valorDeTaxa);

    }
}
