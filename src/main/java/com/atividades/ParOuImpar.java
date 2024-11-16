package com.atividades;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParOuImpar poi = new ParOuImpar();

        System.out.println("Informe um número inteiro");
        int numero = scanner.nextInt();
        poi.parOuImpar(numero);
    }

    public void parOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
