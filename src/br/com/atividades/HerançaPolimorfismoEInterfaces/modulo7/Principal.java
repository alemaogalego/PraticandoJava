package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo7;

public class Principal {
    public static void main(String[] args) {

        Reserva r = new Reserva();
        r.reservar();
        r.reservar("2023-10-10");
        r.reservar("2023-10-10", 4);

        Reserva vip = new ReservaVip();
        vip.reservar();

    }
}
