package com.atividades;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void fazerDeposito(double valor){
        this.saldo += valor;
    }

    public void consultarSaldo(){
        System.out.println(this.saldo);
    }

    public void fazerSaque(double valor){
        this.saldo -= valor;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1, "Gustavo", 2000);

        conta.consultarSaldo();
        conta.fazerDeposito(300);
        conta.consultarSaldo();
        conta.fazerSaque(1500);
        conta.consultarSaldo();

    }
}
