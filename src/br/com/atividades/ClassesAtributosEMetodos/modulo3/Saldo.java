package br.com.atividades.ClassesAtributosEMetodos.modulo3;

public class Saldo {
    double saldo;

    public Saldo (double saldo){
        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.printf("Saldo atual: %.2f \n", saldo);
    }

    public void zerarSaldo(){
        this.saldo = 0;
    }


}
