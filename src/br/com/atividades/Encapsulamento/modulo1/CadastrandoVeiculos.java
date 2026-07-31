package br.com.atividades.Encapsulamento.modulo1;

public class CadastrandoVeiculos {
    static void main(String[] args) {


        Carro carro1 = new Carro("Fusca", "ABC-1234", 1980);


        System.out.println("Modelo: " + carro1.getModelo() + ", Placa: " + carro1.getPlaca() + ", Ano: " + carro1.getAno());



    }
}
