package br.com.atividades.Encapsulamento.modulo4;

public class Usuario {
    private String senha;


    public Usuario(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senhareal, String NovaSenha) {
        if(senhareal.equals(this.senha)){
            this.senha = NovaSenha;
            System.out.println("Senha alterada com sucesso.");
        }else {
            System.out.println("Senha incorreta.");
        }
    }
}
