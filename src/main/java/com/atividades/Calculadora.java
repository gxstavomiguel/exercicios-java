package com.atividades;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcoes;

        do {
            System.out.println("\nInforme a operação:");
            System.out.println("==================");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");

            opcoes = scanner.nextInt();

            if (opcoes >= 1 && opcoes <= 4) {
                System.out.println("Informe o primeiro valor:");
                double n1 = scanner.nextDouble();
                System.out.println("Informe o segundo valor:");
                double n2 = scanner.nextDouble();

                switch (opcoes) {
                    case 1:
                        System.out.println("Resultado: " + calc.somar(n1, n2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + calc.subtrair(n1, n2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + calc.multiplicar(n1, n2));
                        break;
                    case 4:
                        if (n2 != 0) {
                            System.out.println("Resultado: " + calc.dividir(n1, n2));
                        } else {
                            System.out.println("Erro: Divisão por zero!");
                        }
                        break;
                }
            } else if (opcoes == 5) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcoes != 5);

        scanner.close();
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
