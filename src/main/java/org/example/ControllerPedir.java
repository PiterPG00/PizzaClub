package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

public class ControllerPedir implements ActionListener {
    private SystemPizza pizzas;
    private JFrame janelaPrincipal;

    public ControllerPedir(SystemPizza pizzas,JFrame janela){
        this.pizzas = pizzas;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nomePizza = JOptionPane.showInputDialog(janelaPrincipal, "Qual a Pizza: ", "Delivery", JOptionPane.DEFAULT_OPTION);
        int quantidadePizza = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"Quantidade de Pizza: ", "Delivery", JOptionPane.DEFAULT_OPTION));
        try{
            ArrayList pedido = pizzas.Delivery(nomePizza, quantidadePizza);
            JOptionPane.showMessageDialog(janelaPrincipal, "Delivery Feito!", "Delivery", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(janelaPrincipal,  "Pizza: " + nomePizza + "\nQuantidade: " + quantidadePizza, "Delivery", JOptionPane.PLAIN_MESSAGE);
        } catch (ExceptionJaCadastrado ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Já foi feito um Delivery assim!" , "Delivery", JOptionPane.INFORMATION_MESSAGE);
            throw new RuntimeException(ex);
        }


    }
}

