package com.atividades;

public class Funcionario extends Pessoa{
    private double salario;


    public Funcionario(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void aumentoSalarial(){
        System.out.println(salario = salario*2);
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Lucas", 20, 1800);
        funcionario.aumentoSalarial();
    }

}
