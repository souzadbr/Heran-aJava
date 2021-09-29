package br.com.zup.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Pratos {
    private String nomeDoPrato;
    private double precoDoPrato;
    private List<Ingredientes> ingredientes = new ArrayList<>();

    public Pratos() {

    }
    public Pratos(String nomeDoPrato, double precoDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
        this.precoDoPrato = precoDoPrato;

    }

    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public void setNomeDoPrato(String nomeDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
    }

    public double getPrecoDoPrato() {
        return precoDoPrato;
    }

    public void setPrecoDoPrato(double precoDoPrato) {
        this.precoDoPrato = precoDoPrato;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public void adicionarIngrediente (Ingredientes ingrediente){
        this.ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome do Prato; " + nomeDoPrato);
        retorno.append("\n Preço: R$ " + precoDoPrato);
        retorno.append("\n Ingredientes: " + ingredientes);
        return retorno.toString();
    }
}
