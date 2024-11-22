package com.atividades;

import java.io.*;

public class LeituraEscritaArquivos {

    BufferedReader buffer;
    BufferedWriter bufferWrite;

    public static void main(String[] args) {

        //Criação e Escrita do arquivo
        File f = new File("ArquivoTeste.txt");
        //Criação e Escrita do arquivo
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Teste 1");
            bw.newLine();
            bw.write("Teste 2");
            bw.newLine();
            bw.write("Teste 3");

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Leitura do Arquivo
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s;

            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("###### Erro: "+e.getMessage());
            e.printStackTrace();
        }
    }

}
