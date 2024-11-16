package com.atividades;

import java.util.Scanner;

public class Calculadora {

    public boolean sair = false;
    public static int resultado;

    public int Calcular(int operacao, int n2, int n1) {
        if (operacao == 1) {
            return n1 + n2;
        } else if (operacao == 2) {
            int resultado = n1 - n2;
        } else if (operacao == 3) {
            int resultado = n1 * n2;
        } else if (operacao == 4) {
            int resultado = n1 / n2;
        } else if (operacao == 5) {
            System.out.close();
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora cl = new Calculadora();

        System.out.println("Informe a operação");
        int operacao = scanner.nextInt();
        System.out.println("Insira o primeiro valor");
        int n1 = scanner.nextInt();
        System.out.println("Insira o segundo valor");
        int n2 = scanner.nextInt();

        cl.Calcular(operacao, n1, n2);
        System.out.println(resultado);
    }

}
