package com.atividades;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeroPrimo nm = new NumeroPrimo();

        System.out.println("Informe o número: ");
        int numero = scanner.nextInt();
        nm.verificarNumeroPrimo(numero);
    }

    public void verificarNumeroPrimo(int num) {
        if (num > 1) {
            if (num == 2 || num%2==1){
                if(num%5!=0){
                   if(num%3!=0){
                       if(num%7!=0){
                           System.out.println("É primo");
                       }
                   }
                }
            }else {
                System.out.println("Não é primo");
            }
        }
    }
}
