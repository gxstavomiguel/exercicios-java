package com.atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;


        while (!entradaValida) {
            try {
                System.out.println("Informe um número inteiro: ");
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor invalido, insira um número inteiro!");
                scanner.nextLine();
            }
        }
        System.out.println("Conseguiu! o valor inteiro lido foi: " + numero);
    }
}
