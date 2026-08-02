package br.com.atividades.HerançaPolimorfismoEInterfaces.modulo4;

public class Principal {
    public static void main(String[] args) {


        Email novoemail = new Email("joao@example.com", "Assunto do Email", "Corpo do Email");
        novoemail.enviarMensagem();
    }
}
