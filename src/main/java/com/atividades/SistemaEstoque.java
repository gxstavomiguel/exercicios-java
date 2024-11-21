package com.atividades;

import java.util.Scanner;

public class SistemaEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Informe a quantidade inicial do produto: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        int opcao;
        do {
            System.out.println("\n=== Sistema de Estoque ===");
            System.out.println("1. Adicionar Estoque");
            System.out.println("2. Remover Estoque");
            System.out.println("3. Exibir Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a quantidade para adicionar: ");
                    int adicionar = scanner.nextInt();
                    produto.adicionarEstoque(adicionar);
                    break;

                case 2:
                    System.out.print("Informe a quantidade para remover: ");
                    int remover = scanner.nextInt();
                    produto.removerEstoque(remover);
                    break;

                case 3:
                    produto.exibirSaldo();
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
