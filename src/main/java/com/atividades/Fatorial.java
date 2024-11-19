package com.atividades;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fatorial fatorial = new Fatorial();

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();
        fatorial.calculaFatorial(numero);
    }

    public void calculaFatorial(int n) {
        int aux = 0;
        if (n >= 1) {
            for (int i = 1; i <= n; i++){
                aux = n*i + (n-1);
            }
            System.out.println(aux);
        }
    }

}
