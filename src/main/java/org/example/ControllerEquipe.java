package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerEquipe implements ActionListener {
    private SystemPizza pizzas;
    private JFrame janelaPrincipal;

    public ControllerEquipe(SystemPizza pizzas,JFrame janela) {
        this.pizzas = pizzas;
        this.janelaPrincipal = janela;
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(janelaPrincipal, "======================== \nEquipe:" +
        " \n--> Dono: Pedro Henrique " +
        " \n--> Cozinheiro: Juliano de Tal " +
        " \n--> MotoBoy: Mateus de Tal " +
        "\n========================"
        , "Pizza Club", JOptionPane.PLAIN_MESSAGE);
    }

}
