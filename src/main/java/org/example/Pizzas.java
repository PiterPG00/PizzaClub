package org.example;
import java.io.Serializable;
import java.util.Objects;

public class Pizzas implements Serializable {
    private String nomePizza;
    private String saborPizza;
    private double precoPizza;
    private int quantidadePizza;

    public Pizzas(String nomePizza, double precoPizza, String saborPizza, int quantidadePizza) {
        this.nomePizza = nomePizza;
        this.precoPizza = precoPizza;
        this.saborPizza = saborPizza;
        this.quantidadePizza = quantidadePizza;
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }

    public String getSaborPizza() {
        return saborPizza;
    }

    public void setSaborPizza(String saborPizza) {
        this.saborPizza = saborPizza;
    }

    public double getPrecoPizza() {
        return precoPizza;
    }

    public void setPrecoPizza(double precoPizza) {
        this.precoPizza = precoPizza;
    }

    public int getQuantidadePizza() {
        return quantidadePizza;
    }

    public void setQuantidadePizza(int quantidadePizza) {
        this.quantidadePizza = quantidadePizza;
    }

    @Override
    public String toString() {
        return  "Nome: " + nomePizza +
                "\nSabor: " + saborPizza +
                "\nPreco: " + precoPizza +
                "\nQuantidade: " + quantidadePizza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizzas pizzas = (Pizzas) o;
        return Double.compare(precoPizza, pizzas.precoPizza) == 0  && Objects.equals(nomePizza, pizzas.nomePizza) && quantidadePizza == pizzas.quantidadePizza;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomePizza, precoPizza, saborPizza, quantidadePizza);
    }
}
