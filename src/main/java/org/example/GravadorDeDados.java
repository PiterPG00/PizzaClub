package org.example;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {
    public static final String ARQUIVO = "pizzas.txt";
    public HashMap<String, Pizzas> recuperaPizzas() throws IOException {
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream(ARQUIVO));
            return (HashMap<String, Pizzas>) in.readObject();
        } catch (Exception e){
            System.out.println("Não conseguiu recuperar os dados do arquivo das pizzas salvas");
            throw new IOException("Não conseguiu recuperar os dados do arquivo em {" + ARQUIVO + "}");

        } finally {
            if (in!=null){
                in.close();
            }
        }

    }
    public void salvarPizzas(Map<String, Pizzas> pizzas) throws IOException{

        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(ARQUIVO));
            out.writeObject(pizzas);
            System.out.println("salvo com sucesso!");
        } catch (Exception e){
            e.printStackTrace();
            throw new IOException("Erro ao salvar os dados das pizzas em {" + ARQUIVO + "}");
        }finally{
            if(out != null){
                out.close();
            }
        }

    }
}
