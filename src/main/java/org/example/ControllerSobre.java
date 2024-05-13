package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerSobre implements ActionListener {
    private SystemPizza pizzas;
    private JFrame janelaPrincipal;

    public ControllerSobre(SystemPizza pizzas,JFrame janela) {
        this.pizzas = pizzas;
        this.janelaPrincipal = janela;
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(janelaPrincipal, "======================== \nFundadores: \n--> Pedro Henrique \n========================"
        , "Pizza Club", JOptionPane.PLAIN_MESSAGE);
    }

}
