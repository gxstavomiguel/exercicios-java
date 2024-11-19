package com.atividades;

import java.util.Scanner;

public class ContagemCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContagemCaracteres contagem = new ContagemCaracteres();

        System.out.println("Informe a palavra: ");
        String palavra = scanner.nextLine().toLowerCase();
        contagem.vogaisConsoantes(palavra);
    }

    public void vogaisConsoantes(String x) {
        int vogal = 0;
        int consoante = 0;
        int j = 1;
        int l = 1;

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u') {
                vogal = j++;
            } else
                consoante = l++;
        }
        System.out.println("Quantidade de vogais: " + vogal + " Quantidade de consoantes: " + consoante);
    }
}
