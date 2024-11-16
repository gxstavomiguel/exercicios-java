package com.atividades;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Informe a operação");
        System.out.println("==================");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");

        int opcoes = scanner.nextInt();

        while (opcoes != 5) {
            switch (opcoes) {
                case 1:
                    System.out.println("Informe o primeiro valor");
                    double n1 = scanner.nextDouble();
                    System.out.println("Informe o segundo valor");
                    double n2 = scanner.nextDouble();
                    System.out.println(calc.somar(n1, n2));
                    break;


                case 2:
                    System.out.println("Informe o primeiro valor");
                    double n3 = scanner.nextDouble();
                    System.out.println("Informe o segundo valor");
                    double n4 = scanner.nextDouble();
                    System.out.println(calc.subtrair(n3, n4));
                    break;


                case 3:
                    System.out.println("Informe o primeiro valor");
                    double n5 = scanner.nextDouble();
                    System.out.println("Informe o segundo valor");
                    double n6 = scanner.nextDouble();
                    System.out.println(calc.multiplicar(n5, n6));
                    break;


                case 4:
                    System.out.println("Informe o primeiro valor");
                    double n7 = scanner.nextDouble();
                    System.out.println("Informe o segundo valor");
                    double n8 = scanner.nextDouble();
                    System.out.println(calc.dividir(n7, n8));
                    break;


                case 5:
                    System.out.close();
                    break;
            }
            opcoes = 0;
        }
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }
}

