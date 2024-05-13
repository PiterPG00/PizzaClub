package org.example;
import java.io.IOException;
import java.util.*;

public class SystemPizzaMap implements SystemPizza {
    private Map<String, Pizzas> pizzas;

    private GravadorDeDados gravador = new GravadorDeDados();

    public SystemPizzaMap(){
        this.pizzas = new HashMap<>();
        recuperaPizzas();
    }

    public void salvarPizzas(){
        try{
            this.gravador.salvarPizzas(this.pizzas);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void recuperaPizzas(){
        try {
            this.pizzas = this.gravador.recuperaPizzas();
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }


    @Override
    public boolean cadastrarPizza(String nomePizza, String saborPizza, double precoPizza, int quantidadePizza) throws ExceptionJaCadastrado {
        if(!pizzas.containsKey(nomePizza)){
            this.pizzas.put(nomePizza, new Pizzas(nomePizza, precoPizza, saborPizza, quantidadePizza));
            return true;
        }else{
            throw new ExceptionJaCadastrado("Essa Pizza já foi cadastrada!");
        }
    }

    @Override
    public boolean removerPizza(String nomePizza) {
        if(this.pizzas.containsKey(nomePizza)){
            this.pizzas.remove(nomePizza);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Collection<Pizzas> listarPizzas() {
        Collection<Pizzas> listaPizzas = new ArrayList<>();
        for (Pizzas c: this.pizzas.values())
            listaPizzas.add(c);
        return listaPizzas;
    }

    @Override
    public Collection<Pizzas> pesquisaPizza(String nomePizza, String saborPizza) {
        Collection<Pizzas> pizzasPesquisadas = new ArrayList<>();
        for (Pizzas c: this.pizzas.values()){
            if(c.getNomePizza().equals(nomePizza) || c.getSaborPizza().equals(saborPizza)){
                pizzasPesquisadas.add(c);
            }
        }
        return pizzasPesquisadas;
    }

    @Override
    public int quantidadeGeral() {
        int QuantTotal = 0;
        for(Pizzas c : pizzas.values()) {
            QuantTotal += c.getQuantidadePizza();
        }
        return QuantTotal;
    }
    @Override
    public ArrayList<Pizzas> Delivery(String nomePizza, int quantidadePizza) throws ExceptionJaCadastrado {
        ArrayList<Pizzas> delivery = new ArrayList<>();
        if(!pizzas.containsKey(nomePizza)){
            delivery.add(this.pizzas.get(nomePizza));
            delivery.add(this.pizzas.get(quantidadePizza));
            return delivery;
        }else{
            throw new ExceptionJaCadastrado("Esse delivery já foi pedido!");
        }
    }
}
