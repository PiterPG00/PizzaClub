package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.stream.Collectors;

public class ControllerListar implements ActionListener {
    private SystemPizza pizza;
    private JFrame janelaPrincipal;

    SystemPizzaMap systemPizzaMap = new SystemPizzaMap();

    public ControllerListar (SystemPizza pizza, JFrame janela){
        this.pizza = pizza;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        systemPizzaMap.listarPizzas();
        Collection<Pizzas> pizzas = pizza.listarPizzas();
        if(pizzas.size() == 0) {
            JOptionPane.showMessageDialog(null,"Nenhuma Pizza Cadastrada!","Pizzas", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String pizzasString = pizzas.stream().map(Pizzas::toString).collect(Collectors.joining("\n"));
            JOptionPane.showMessageDialog(janelaPrincipal,"Pizzas: \n" + pizzasString + "\n","Pizzas", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
