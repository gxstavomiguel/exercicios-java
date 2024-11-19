package com.atividades;

import java.util.Scanner;

public class Polindromo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Polindromo polindromo;

        System.out.println("Informe a palavra");
        String palavra = scanner.nextLine();
        if(verificaPolindromo(palavra.trim().toUpperCase())) {
            System.out.println("É um polindromo");
        } else {
            System.out.println("Não é um polindromo");
        }
        scanner.close();
    }

    public static boolean verificaPolindromo(String x) {
        for(int i = 0, j = x.length() - 1; i < j; i++, j--){
            if(x.charAt(i) != x.charAt(j)) {
                return false;
            }
        } return true;
    }
}
