package br.com.atividades.Encapsulamento.modulo4;

public class ControleDeSenha {
    static void main(String[] args) {

        Usuario user = new Usuario("12345");
        user.setSenha("123456", "54321");

        System.out.println(user.getSenha());

    }

}
