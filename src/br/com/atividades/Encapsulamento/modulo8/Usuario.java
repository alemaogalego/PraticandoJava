package br.com.atividades.Encapsulamento.modulo8;

public class Usuario {
    private String usuario;
    private String senha;


    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }


    public boolean validarLogin(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }
}
