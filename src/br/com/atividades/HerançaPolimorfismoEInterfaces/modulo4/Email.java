package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo4;

public class Email extends Notificacao {
    private String corpo;


    public Email(String destinatario, String mensagem, String corpo) {
        super(destinatario, mensagem);
        this.corpo = corpo;
    }

    @Override
    public void enviarMensagem() {
        System.out.printf("Enviando Email para: %s\n", getDestinatario());
        System.out.printf("Assunto: %s\n", getMensagem());
        System.out.printf("Corpo do Email: %s\n", corpo);

    }
}
