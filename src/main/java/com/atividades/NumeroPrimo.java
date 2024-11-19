package com.atividades;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumeroPrimo nm = new NumeroPrimo();

        System.out.println("Informe o número: ");
        int numero = scanner.nextInt();
        if(verificarNumeroPrimo(numero)){
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }

    public static boolean verificarNumeroPrimo(int num) {
        if(num <= 1){
            return false;
        }
        if (num == 2){
            return true;
        }
        if(num % 2 == 0){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(num); i +=2){
            if(num % i == 0){
                return false;
            }
        } return true;
    }
}

