package com.atividades;

import java.util.Scanner;

public class ContagemRegressiva {

    public static void main(String[] args) {
        ContagemRegressiva contagemRegressiva = new ContagemRegressiva();
        contagemRegressiva.contagem();
    }

    public void contagem(){
        for(int i = 10; i > 0; i--) {
            System.out.println("Contagem regressiva: " + i);
        }
    }
}
