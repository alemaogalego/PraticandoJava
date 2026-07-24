package br.com.atividades.WhileeFor.modulo2;

public class SomaDeNumeros {
    public static void main(String[] args) {

        int[] valores = {10, 20, 30, 40, 50};

        int soma = 0;


        for (int valore : valores) {
            soma += valore;
            System.out.println(soma);
        }


        System.out.println("Resultado final da soma: " + soma);
    }


}
