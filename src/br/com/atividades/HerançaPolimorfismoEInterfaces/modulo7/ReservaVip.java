package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo7;

public class ReservaVip extends Reserva{

    @Override
    public void reservar() {
        System.out.println("Reserva VIP realizada com sucesso!");
    }
}
