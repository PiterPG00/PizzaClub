package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MenuPrincipal extends JFrame {
    JLabel imgPizzaClub;
    private SystemPizza pizza;
    SystemPizzaMap systemPizzaMap = new SystemPizzaMap();

    ControllerSalvar gravaPizza;
    ImageIcon Logo = new ImageIcon("./src/main/resources/img-menu.png");
    public MenuPrincipal() {
        setTitle("                                                                                                                                                                                                                          Pizza Club");
        setSize(1200, 1200);
        setLocation(400,400);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pizza = new SystemPizzaMap();
        gravaPizza = new ControllerSalvar(systemPizzaMap, this);
        imgPizzaClub = new JLabel(Logo, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout());
        getContentPane().add(imgPizzaClub);
        
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menuVazio = new JMenu("                                                                                                                                                                        ");
        JMenu menuPizzas = new JMenu("Pizzas");
        JMenu menuEstoque = new JMenu("Estoque");
        JMenu menuConfiguracoes = new JMenu("Configurações");
        JMenu menuDelivery = new JMenu("Delivery");
        JMenu menuMais = new JMenu("Mais");


        JMenuItem menuItemCadastrar = new JMenuItem("- Cadastrar");
        JMenuItem menuItemRemover = new JMenuItem("- Remover");
        JMenuItem menuItemListar = new JMenuItem("- Listar");

        menuPizzas.add(menuItemCadastrar);
        menuPizzas.add(menuItemRemover);
        menuPizzas.add(menuItemListar);

        JMenuItem menuItemPesquisar = new JMenuItem("- Pesquisar Pizza");
        JMenuItem menuItemQuantidade = new JMenuItem("- Quantidade Geral");

        menuEstoque.add(menuItemPesquisar);
        menuEstoque.add(menuItemQuantidade);

        JMenuItem menuItemSalvar = new JMenuItem("- Salvar");
        JMenuItem menuItemApagar = new JMenuItem("- Apagar");
        JMenuItem menuItemModoEscuro = new JMenuItem("- Modo Escuro");

        menuConfiguracoes.add(menuItemSalvar);
        menuConfiguracoes.add(menuItemApagar);
        menuConfiguracoes.add(menuItemModoEscuro);


        JMenuItem menuItemPedir = new JMenuItem("- Pedir");
        JMenuItem menuItemCancelar = new JMenuItem("- Cancelar");

        menuDelivery.add(menuItemPedir);
        menuDelivery.add(menuItemCancelar);

        JMenuItem menuItemSobre = new JMenuItem("- Sobre");
        JMenuItem menuItemEquipe = new JMenuItem("- Equipe");
        JMenuItem menuItemAtualizacoes = new JMenuItem("- Atualizações");
        
        menuMais.add(menuItemSobre);
        menuMais.add(menuItemEquipe);
        menuMais.add(menuItemAtualizacoes);

        menuBar.add(menuVazio);
        menuBar.add(menuPizzas);
        menuBar.add(menuEstoque);
        menuBar.add(menuConfiguracoes);
        menuBar.add(menuDelivery);
        menuBar.add(menuMais);
        setJMenuBar(menuBar);

        menuItemCadastrar.addActionListener(new ControllerCadastrar(systemPizzaMap, this));
        menuItemListar.addActionListener(new ControllerListar(systemPizzaMap,this));
        menuItemPesquisar.addActionListener(new ControllerPesquisar(systemPizzaMap, this));
        menuItemRemover.addActionListener(new ControllerApagar(systemPizzaMap, this));
        menuItemSalvar.addActionListener(new ControllerSalvar(systemPizzaMap, this));
        menuItemQuantidade.addActionListener(new ControllerQntdGeral(systemPizzaMap,this));
        menuItemPedir.addActionListener(new ControllerPedir(systemPizzaMap, this));
        menuItemSobre.addActionListener(new ControllerSobre(systemPizzaMap, this));
        menuItemEquipe.addActionListener(new ControllerEquipe(systemPizzaMap, this));
        menuItemAtualizacoes.addActionListener(new ControllerAtualizacoes(systemPizzaMap, this));
                
    }

    public static void main(String[] args) {
        JFrame janela = new MenuPrincipal();
        janela.setVisible(true);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//Exemplo alternativo de expressão lambda
        /**menuItemCadastrar.addActionListener(
                (ae) -> {
                    String nomePizza = JOptionPane.showInputDialog(this,
                            "");
                    String saborPizza = JOptionPane.showInputDialog(this,
                            "");
                    double precoPizza= Integer.parseInt(JOptionPane.showInputDialog(this,
                            ""));
                    int quantidadePizza = Integer.parseInt(JOptionPane.showInputDialog(this,
                            ""));
                    boolean pedido = false;
                    try{
                        pedido = SystemPizzaMap.menuItemCadastrar(nomePizza, saborPizza, precoPizza, quantidadePizza);
                        JOptionPane.showMessageDialog(this,
                                        "Pizza cadastrada");
                    } catch (ExceptionJaCadastrado e) {
                        JOptionPane.showMessageDialog(this,
                                "Pizza não foi cadastrada.");
                    }
                });*/