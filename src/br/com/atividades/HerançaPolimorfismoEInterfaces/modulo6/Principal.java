package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo6;

public class Principal {
    public static void main(String[] args) {

        Notificador notificacao = new Notificador();
        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);

    }
}
