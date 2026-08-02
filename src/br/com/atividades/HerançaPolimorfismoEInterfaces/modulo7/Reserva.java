package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo7;

public class Reserva {

    public void reservar(){
        System.out.println("Reserva realizada com sucesso!");
    }

    public void reservar(String data){
        System.out.println("Reserva realizada para a data: " + data);
    }

    public void reservar(String data, int quantidade){
        System.out.println("Reserva realizada para a data: " + data + " para" + quantidade + " pessoas");
    }


}
