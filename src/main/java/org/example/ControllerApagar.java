package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerApagar implements ActionListener {
    private SystemPizza pizzas;
    private JFrame janelaPrincipal;

    public ControllerApagar(SystemPizza pizzas,JFrame janela) {
        this.pizzas = pizzas;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nomePizza =  JOptionPane.showInputDialog(janelaPrincipal,"Digite o nome da Pizza:", "Remover Pizza", JOptionPane.DEFAULT_OPTION);
        boolean pedido = pizzas.removerPizza(nomePizza);
        if(pedido){
            JOptionPane.showMessageDialog(janelaPrincipal,"Pizza removida!","Remover Pizza",JOptionPane.DEFAULT_OPTION);
        }else{
            JOptionPane.showMessageDialog(janelaPrincipal,"ERRO NA REMOÇÃO!"+"\n\nPizza não foi encontrada","Remover Pizza",JOptionPane.DEFAULT_OPTION);
        }
    }
}
