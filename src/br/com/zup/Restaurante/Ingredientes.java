package br.com.zup.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Ingredientes {
    private List <Ingredientes> ingredientes = new ArrayList<>();

    public Ingredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
       StringBuilder retorno = new StringBuilder();
       retorno.append(ingredientes);
       return retorno.toString();
    }
}
