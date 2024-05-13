package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerCadastrar implements ActionListener {
    private SystemPizzaMap pizzas;
    private JFrame janelaPrincipal;
    public ControllerCadastrar(SystemPizzaMap pizzas, JFrame janela){
        this.pizzas = pizzas;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nomePizza = JOptionPane.showInputDialog(janelaPrincipal, "Nome da Pizza: ", "Cadastrar Pizza", JOptionPane.INFORMATION_MESSAGE);
        String saborPizza = JOptionPane.showInputDialog(janelaPrincipal, "Sabor da Pizza: ", "Cadastrar Pizza", JOptionPane.INFORMATION_MESSAGE);
        double precoPizza = Double.parseDouble(JOptionPane.showInputDialog(janelaPrincipal, "Preço da Pizza:", "Cadastrar Pizza", JOptionPane.INFORMATION_MESSAGE));
        int quantidadePizza = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Pizzas: ", JOptionPane.INFORMATION_MESSAGE));
        try{
            boolean pedido = pizzas.cadastrarPizza(nomePizza, saborPizza, precoPizza, quantidadePizza);
            JOptionPane.showMessageDialog(janelaPrincipal, "Pizza Cadastrada", "Cadastrar Pizza", JOptionPane.INFORMATION_MESSAGE);
        } catch (ExceptionJaCadastrado ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Pizza não foi cadastrada!  " + "\nProvavelmente já existe", "Cadastrar Pizza", JOptionPane.INFORMATION_MESSAGE);
            throw new RuntimeException(ex);
        }
    }
}
