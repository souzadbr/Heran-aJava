package br.com.zup.Restaurante;

public class Pratos {
    private String nomeDoPrato;
    private String diaDaSemana;
    private double precoDoPrato;
    private Ingredientes ingredientes;

    public Pratos(String nomeDoPrato, String diaDaSemana, double precoDoPrato, Ingredientes ingredientes) {
        this.nomeDoPrato = nomeDoPrato;
        this.diaDaSemana = diaDaSemana;
        this.precoDoPrato = precoDoPrato;
        this.ingredientes = ingredientes;
    }

    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public void setNomeDoPrato(String nomeDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
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
