package com.atividades;

import java.util.Arrays;
import java.util.Scanner;

//Não é o algoritmo bubblesort original
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] conjuntoDeInteiros;
        conjuntoDeInteiros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe os números inteiros para ordenar: ");
            conjuntoDeInteiros[i] = scanner.nextInt();
        }
        System.out.println("Números ordenados: ");
        Arrays.stream(conjuntoDeInteiros).sorted().forEach(System.out::println);
    }
}
