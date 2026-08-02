package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo10;

public class Luz implements Controlavel {
    private boolean ligado = false;


    @Override
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Luz ligada.");
        } else {
            System.out.println("A luz já está ligada.");
        }
    }
    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Luz desligada.");
        } else {
            System.out.println("A luz já está desligada.");
        }
    }
}


