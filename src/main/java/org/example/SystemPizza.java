package org.example;
import java.util.ArrayList;
import java.util.Collection;

public interface SystemPizza {

    boolean cadastrarPizza(String nomePizza, String saborPizza, double precoPizza, int quantidadePizza) throws ExceptionJaCadastrado;

    boolean removerPizza(String nomeItem);

    Collection<Pizzas> listarPizzas();

    Collection<Pizzas> pesquisaPizza(String nomePizza, String saborPizza);

    void recuperaPizzas();

    void salvarPizzas();

    int quantidadeGeral();

    ArrayList<Pizzas> Delivery(String nomeItem, int quantItem) throws ExceptionJaCadastrado;

}
