package br.com.atividades.ClassesAtributosEMetodos.modulo4;

public class Temperatura {
    private float temperatura;
    private String local;

    public Temperatura(float temperatura, String local) {
        this.temperatura = temperatura;
        this.local = local;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }


    public void verificarTemperatura(){
        if(temperatura > 35.5){
            System.out.printf("Sensor no local: %s\n", local);
            System.out.printf("Temperatura: %.1f ºC \n", temperatura);
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }

}
