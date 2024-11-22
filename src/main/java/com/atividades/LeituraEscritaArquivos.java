package com.atividades;

import java.io.*;

public class LeituraEscritaArquivos {
    public static void main(String[] args) {
        String inputFile = "nomes.txt";
        String outputFile = "novosNomes.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                writer.write(linha);
                writer.newLine();
            }
            System.out.println("Arquivo copiado");
        }  catch (IOException e) {
            System.out.println("Erro ao copiar");
        }
    }
}
