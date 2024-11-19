package com.atividades;
import java.util.Arrays;
import java.util.Scanner;

public class RemoverDuplicatas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RemoverDuplicatas removerDuplicatadas = new RemoverDuplicatas();
        String[] palavras = new String[5];

        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Informe as palavras");
            palavras[i] = scanner.nextLine().toLowerCase();
            ;
        }
    }

    public void Duplicatas(String[] palavras) {
        for (int i = 1; i < palavras.length; i++) {
            //if(palavras[i].equals(palavras[i])){
            if (palavras[i] == palavras[i]) {
                String[] novasPalavras = palavras[i].split(" ");
                System.out.println(Arrays.toString(novasPalavras));
            }
        }
    }

}
