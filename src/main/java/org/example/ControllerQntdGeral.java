package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.*;

public class ControllerQntdGeral implements ActionListener {
    private SystemPizza pizza;
    private JFrame janelaPrincipal;
    SystemPizzaMap systemPizzaMap = new SystemPizzaMap();

    public ControllerQntdGeral(SystemPizza pizza,JFrame janela){
        this.pizza = pizza;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        systemPizzaMap.recuperaPizzas();
        JOptionPane.showMessageDialog(janelaPrincipal, "Quantidade de Pizzas: " + this.pizza.quantidadeGeral() , "Quantidade de Pizzas", JOptionPane.INFORMATION_MESSAGE);
    }
}
