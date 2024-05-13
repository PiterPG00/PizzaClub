package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class ControllerPesquisar implements ActionListener {
    private SystemPizza pizzas;
    private JFrame janelaPrincipal;
    SystemPizzaMap systemPizzasMap = new SystemPizzaMap();
    public ControllerPesquisar(SystemPizza pizzas, JFrame janela){
        this.pizzas = pizzas;
        this.janelaPrincipal = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        systemPizzasMap.recuperaPizzas();
        String nomePizza = JOptionPane.showInputDialog(janelaPrincipal,"informe o nome da Pizza", "Pizzas",JOptionPane.DEFAULT_OPTION);
        String saborPizza = JOptionPane.showInputDialog(janelaPrincipal,"informe o sabor da Pizza", "Pizzas",JOptionPane.DEFAULT_OPTION);
        Collection<Pizzas> pizza = pizzas.pesquisaPizza(nomePizza, saborPizza);
        if(pizza.size() > 0){
            for(Pizzas c: pizza){
                JOptionPane.showMessageDialog(janelaPrincipal,c.toString(),"Pizzas", JOptionPane.DEFAULT_OPTION);
            }
        }else{
            JOptionPane.showMessageDialog(janelaPrincipal,"Não foi encontrado nenhuma Pizza.", "Pizzas", JOptionPane.DEFAULT_OPTION);

        }
    }
}
