package com.atividades;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.imprimirNumeros();
    }

    public void imprimirNumeros() {
        int a = 0;
        int b = 1;
        int temp = 0;

        for (int i = 0; i < 22; i++) {
            System.out.println(a);
            temp = a + b;
            a = b;
            b = temp;
        }
    }
}
