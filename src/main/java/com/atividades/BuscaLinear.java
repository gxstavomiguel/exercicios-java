package com.atividades;

public class BuscaLinear {
    public static void main(String[] args) {

        boolean encontrado = false;
        int x = 17;
        int[] numeros = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30
        };

        for (int i = 0; i < numeros.length; i++) {
            if (x == numeros[i]) {
                System.out.println("O número se encontra na posição: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Elemento não encontrado na lista");
        }

    }

}
