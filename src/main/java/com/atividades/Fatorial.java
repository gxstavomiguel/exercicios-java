package com.atividades;

import java.util.Scanner;

public class Fatorial {

    public static int fatorial(int n){
        if(n <= 1){
            return 1;
        } else {
            return fatorial(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int x = scanner.nextInt();

        System.out.println("Fatorial de " + x + " é " + fatorial(x));
    }

    // versão que fiz a partir de um código em c, tá com algum problema.
    public int calculoFatorial(int x){
        if(x == 0 || x == 1){
            return 1;
        } else {
            return x*calculoFatorial(x-1);
        }
    }

}
