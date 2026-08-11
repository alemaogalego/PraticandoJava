package br.com.atividades.Lambda.modulo4;

public class VerificacaoDePalindromos {
    static void main(String[] args) {
        Palindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(palindromo.verificarPalindromo("radar")); // true
        System.out.println(palindromo.verificarPalindromo("python")); // false
    }
}
