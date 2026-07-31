package br.com.atividades.Encapsulamento.modulo5;

public class ControleDoNivelDeBateria {
    static void main(String[] args) {

        Bateria b1 = new Bateria();
        Bateria b2 = new Bateria();

        b1.setNivelBateria(10);
        b2.setNivelBateria(90);

        System.out.println("Status da bateria 1: " + b1.exibirStatus());
        System.out.println("Status da bateria 2: " + b2.exibirStatus());
    }
}
