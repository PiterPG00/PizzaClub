package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerAtualizacoes implements ActionListener {
    private SystemPizza pizzas;
    private JFrame janelaPrincipal;
    public ControllerAtualizacoes(SystemPizza pizzas,JFrame janela) {
        this.pizzas = pizzas;
        this.janelaPrincipal = janela;
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(janelaPrincipal, "======================== \nAtualizações:" +
        " \n--> Atualização 0.2" +
        " \n-->  Correção de Bugs " +
        " \n-->  11/05/2024 - 02:37" +
        "\n" +
        " \n--> Atualização 0.1" +
        " \n--> Criação do Programa Completo " +
        " \n-->  10/05/2024 - 13:45" +
        "\n========================"
        , "Pizza Club", JOptionPane.PLAIN_MESSAGE);
    }

}
