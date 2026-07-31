package br.com.atividades.Encapsulamento.modulo5;

public class Bateria {
    private int nivelBateria;

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if(nivelBateria >= 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
        }
    }

    public String exibirStatus(){
        if(nivelBateria <= 20){
            return "Bateria fraca";
        } else if (nivelBateria <= 80) {
            return "Bateria ok";
        } else {
            return "Bateria cheia";

        }
    }
}
