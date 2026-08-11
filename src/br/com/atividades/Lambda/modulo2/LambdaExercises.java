package br.com.atividades.Lambda.modulo2;

public class LambdaExercises {

    static void main(String[] args) {
        Primo primo = numero -> {
            if(numero <= 1)return false;
            for(int i = 2; i <= Math.sqrt(numero); i++) {
                if(numero % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(primo.verificaPrimo(7)); // true
        System.out.println(primo.verificaPrimo(10)); // false
    }
}
