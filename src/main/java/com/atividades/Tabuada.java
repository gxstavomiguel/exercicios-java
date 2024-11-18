package com.atividades;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){

        Tabuada tabuada = new Tabuada();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para descobrir a tabuada");
        int x = scanner.nextInt();
        tabuada.calcular(x);
    }

    public void calcular(int x){
        for(int i = 1; i <= 10; i++){
            System.out.println("Tabuada: " + x * i);
        }
    }
}
