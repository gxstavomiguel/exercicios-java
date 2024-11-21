package com.atividades;

abstract class Animal {
    public abstract void emitirSom();
}

public class TestePolimorfismo {
    public static void main(String[] args) {

        Animal[] animais = new Animal[2];

        animais[0] = new Cachorro();
        animais[1] = new Gato();

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}