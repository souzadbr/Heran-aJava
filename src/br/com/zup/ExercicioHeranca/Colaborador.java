package br.com.zup.ExercicioHeranca;

public class Colaborador extends Pessoa {
        private int codigoSetor;
        private double salarioBase;
        private double Imposto;

    public Colaborador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        Imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return Imposto;
    }

    public void setImposto(double imposto) {
        Imposto = imposto;
    }
    public double calcularSalario(){
        return salarioBase - Imposto;
    }
}
