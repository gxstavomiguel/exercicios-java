package com.atividades;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaiorNumero maiorNumero = new MaiorNumero();
        int[] numeros = new int[3];
        int maiorValor = Integer.MIN_VALUE;

        System.out.println("Informe os 3 valores inteiros");

        for (int j = 0; j < numeros.length; j++) {
            numeros[j] = scanner.nextInt();

            if (maiorValor < numeros[j]) {
                maiorValor = numeros[j];
            }
        }
        System.out.println(maiorValor);
    }

}
