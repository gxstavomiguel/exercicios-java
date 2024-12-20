package com.atividades;

public class Carro {

    private String marca;
    private String modelo;
    private String ano;

    public Carro(String marca, String modelo, String ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public static void main(String[] args) {
        Carro carro = new Carro("renault", "sandero", "2016");
        carro.exibirInformacoes();
    }

    public void exibirInformacoes(){
        System.out.println(getMarca() + " " + getModelo() + " " + getAno());
    }
}
