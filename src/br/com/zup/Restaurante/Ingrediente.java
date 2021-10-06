package br.com.zup.Restaurante;


public class Ingrediente {
    private String nomeIngrediente;


    public Ingrediente() {


    }
    public Ingrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;

    }


    public String getNomeIngredeinte() {
        return nomeIngrediente;
    }

    public void setNomeIngredeinte(String nomeIngredeinte) {
        this.nomeIngrediente = nomeIngredeinte;
    }



    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(nomeIngrediente);
        return retorno.toString();
    }
}
