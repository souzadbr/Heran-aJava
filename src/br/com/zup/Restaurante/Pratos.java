package br.com.zup.Restaurante;

public class Pratos {
    private String nomeDoPrato;
    private double precoDoPrato;
    private Ingredientes ingredientes;

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

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
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
