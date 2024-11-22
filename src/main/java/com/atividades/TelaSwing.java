package com.atividades;

import javax.swing.*;
import java.awt.*;

public class TelaSwing extends JFrame {
    public static void main(String[] args) {
        TelaSwing field = new TelaSwing();
        field.testeFormatacao();
    }

    public void testeFormatacao(){
        Container janela = getContentPane();
        setLayout(null);

        JLabel labelNome = new JLabel("Nome: ");
        labelNome.setBounds(50,40,100,20);

        JTextField textNome = new JTextField();
        textNome.setBounds(50,60,100,20);

        JButton botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(70,100,100,40);

        janela.add(labelNome);
        janela.add(textNome);
        janela.setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
