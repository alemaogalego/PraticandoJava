package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo4;

public class Notificacao {
    private String destinatario;
    private String mensagem;


    public Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }


    public void enviarMensagem() {
        System.out.printf("Enviando mensagem para %s: %s%n", destinatario, mensagem);
    }


    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }
}
