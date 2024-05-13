package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;
import java.io.File;

public class TestePizza {
    @Test
    public void TesteAdicionarPizza() {
        SystemPizzaMap PizzaClub = new SystemPizzaMap();
        try {
            PizzaClub.cadastrarPizza("Moda da Casa","Mussarela",50.0,5);
        } catch (ExceptionJaCadastrado e) {
            fail("Não deve lançar exceção");
        }
        try {
            PizzaClub.cadastrarPizza("Moda da Casa","Mussarela",50.0,5);
            fail("É para lançar a exceção ou um cadastrado");
        } catch (ExceptionJaCadastrado e) {
        }
    }
    @Test
    public void TestaPesquisarPizza() {
        SystemPizzaMap PizzaClub = new SystemPizzaMap();
        try {
            PizzaClub.cadastrarPizza("Completona", "Frango", 40,10);
            PizzaClub.cadastrarPizza("ClubPro", "Calabresa", 42,8);
            assertEquals(1, PizzaClub.pesquisaPizza("ClubPro","Calabresaa").size());
        } catch (ExceptionJaCadastrado e) {
            fail("Não deve lançar exceção");
        }try{
            PizzaClub.cadastrarPizza("Carne de Sol","Carne de Sol", 60,15);
        }catch (ExceptionJaCadastrado e){
        }
    }
    @Test
    public void TestaListarPizzas(){
        SystemPizzaMap PizzaClub = new SystemPizzaMap();
        assertEquals(1,PizzaClub.listarPizzas().size());
        try{
            PizzaClub.cadastrarPizza("Completona", "Frango", 40,10);
            PizzaClub.cadastrarPizza("ClubPro", "Calabresaa", 42,8);
            PizzaClub.cadastrarPizza("Carne de Sol","Carne de Sol", 60,15);
            assertEquals(4,PizzaClub.listarPizzas().size());
        }catch (ExceptionJaCadastrado e){
            fail("Não deve lançar exceção");
        }
    }
    @Test
    public void TestaGravador() {
        File f = new File(GravadorDeDados.ARQUIVO);
        if (f.exists()) {
            f.delete();
        }
        SystemPizzaMap PizzaClub = new SystemPizzaMap();
        try {
            PizzaClub.cadastrarPizza("Carne de Sol","Carne de Sol", 60,15);
            PizzaClub.salvarPizzas();
            assertEquals(1, PizzaClub.pesquisaPizza("Carne de Sol","Carne de Sol").size());
            assertTrue(f.exists());
            f.delete();
        } catch (ExceptionJaCadastrado e) {
        }
    }
    @Test
    public void TestRemoverPizza() {
        SystemPizzaMap PizzaClub = new SystemPizzaMap();
        try {
            PizzaClub.cadastrarPizza("ClubPro", "Calabresaa", 42,8);
            PizzaClub.cadastrarPizza("Carne de Sol","Carne de Sol", 60,15);
            assertEquals(2, PizzaClub.listarPizzas().size());
            PizzaClub.removerPizza("ClubPro");
            assertEquals(1, PizzaClub.listarPizzas().size());
        } catch (ExceptionJaCadastrado e) {
        } 
    }
}
