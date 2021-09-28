package br.com.zup.Restaurante;

import br.com.zup.Imobiliaria.Moradores;

import java.util.ArrayList;
import java.util.List;

public class Ingredientes {
    private String nomeIngrediente;

    private List <Ingredientes> ingredientes = new ArrayList<>();

    public Ingredientes(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;

    }


    public String getNomeIngredeinte() {
        return nomeIngrediente;
    }

    public void setNomeIngredeinte(String nomeIngredeinte) {
        this.nomeIngrediente = nomeIngredeinte;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }


    @Override
    public String toString() {
       StringBuilder retorno = new StringBuilder();
       retorno.append("Lista ingredientes" + ingredientes);
       return retorno.toString();
    }
}
