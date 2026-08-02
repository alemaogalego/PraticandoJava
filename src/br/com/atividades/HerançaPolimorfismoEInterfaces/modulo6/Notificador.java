package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo6;

public class Notificador {


    public void enviarMensagem(String mensagem){
        System.out.printf("Mensagem enviada: %s%n", mensagem);
    }

    public void enviarMensagem(String nome, String mensagem){
        System.out.printf("Mensagem enviada para %s: %s%n", nome, mensagem);
    }


    public void enviarMensagem(String nome, String mensagem, int vezes){
        for (int i = 0; i < vezes; i++) {
            System.out.printf("Mensagem enviada para %s: %s%n", nome, mensagem);
        }

    }
}
