package com.atividades;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoverDuplicatas {
        public static void main(String[] args) {

            ArrayList<String> ArrayListpalavras = new ArrayList<>();
            ArrayList<String> NovoArrayListpalavras = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                System.out.println("Informe as palavras: ");
                ArrayListpalavras.add(scanner.nextLine());
            }

            for (String c : ArrayListpalavras) {
                if(!NovoArrayListpalavras.contains(c)) {
                    NovoArrayListpalavras.add(c);
                };
            }

            System.out.println("Palavras dentro do ArrayList: " + NovoArrayListpalavras);
        }
    }



