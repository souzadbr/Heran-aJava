package br.com.zup.ExercicioHeranca;

public class Administrador extends Colaborador{
        private double ajudaDecusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDecusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDecusto = ajudaDecusto;
    }

    public double getAjudaDecusto() {
        return ajudaDecusto;
    }

    public void setAjudaDecusto(double ajudaDecusto) {
        this.ajudaDecusto = ajudaDecusto;
    }
    @Override
    public double calcularSalario(){
        return getSalarioBase()-getImposto()+ajudaDecusto;

    }
}
