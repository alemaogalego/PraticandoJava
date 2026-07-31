package br.com.atividades.ClassesAtributosEMetodos.modulo9;


public class Multa {
    private String titulo;
    private int diasAtraso; // Ajustado para int

    // Construtor
    public Multa(String titulo, int diasAtraso) {
        this.titulo = titulo;
        this.diasAtraso = diasAtraso;
    }


    public void calcularMulta() {
        double valorMultaPorDia = 2.50;

        if (diasAtraso > 0) {
            double totalMulta = valorMultaPorDia * diasAtraso;
            System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n", titulo, diasAtraso, totalMulta);
        } else {
            System.out.println("Livro entregue no prazo. Sem multa!");
        }
    }
}