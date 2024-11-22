package com.atividades;

import java.lang.Thread;

public class ThreadsJava implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        (new Thread(new ThreadsJava())).start();
    }

}
