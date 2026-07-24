package br.com.atividades.WhileeFor.modulo8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContandoNumerosPositivosENegativos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> lista = new ArrayList();
        while(true){
            System.out.println("Digite um numero:  (OU 'FIM' P PARAR) ");
            String temp = input.nextLine();
            if(temp.toUpperCase().equals("FIM")){
                break;

            }
            lista.add(Integer.parseInt(temp));
        }

        int valorPositivo = 0;
        int valorNegativo = 0;

        for (Integer v : lista) {
            if (v > 0) {
                valorPositivo++;
            }else {
                valorNegativo++;
            }
        }
        System.out.println("qtd de valor positivo " + valorPositivo);
        System.out.println("qtd de valor negativo " + valorNegativo);
        System.out.println(lista);
    }


}
