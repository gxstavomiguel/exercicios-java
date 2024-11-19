package com.atividades;

import java.util.Arrays;
import java.util.Scanner;

public class InvertendoArray {
    public static void main(String[] args) {
        InvertendoArray invertendoArray = new InvertendoArray();
        Scanner scanner = new Scanner(System.in);
        int[] conjuntoDeInteiros;
        conjuntoDeInteiros = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Informe os valores");
        conjuntoDeInteiros[i] = scanner.nextInt();
        }
        for(int i = 0, j = 2; i < conjuntoDeInteiros.length; i++, j--){
        //System.out.println(Arrays.toString(conjuntoDeInteiros));
            System.out.print(conjuntoDeInteiros[j] + " ");
        }
    }

}
