package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerSalvar implements ActionListener {
    private SystemPizza pizzas;
    private JFrame janelaPrincipal;

    public ControllerSalvar(SystemPizza pizzas, JFrame janelaPrincipal){
        this.pizzas = pizzas;
        this.janelaPrincipal = janelaPrincipal;
    }
    public void actionPerformed(ActionEvent e) {
        pizzas.salvarPizzas();
        JOptionPane.showMessageDialog(janelaPrincipal, "Dados Salvos com Sucesso!", "Salvar Pizzas", JOptionPane.INFORMATION_MESSAGE);
    }
}
