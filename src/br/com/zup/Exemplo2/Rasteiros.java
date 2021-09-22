package br.com.zup.Exemplo2;

public class Rasteiros extends Inimigos{
    private double numeroPernaS;

    public Rasteiros(String nome, String cor, String tipoAtaque, int vida, double numeroPernaS) {
        super(nome, cor, tipoAtaque, vida);
        this.numeroPernaS = numeroPernaS;
    }

    public double getNumeroPernaS() {
        return numeroPernaS;
    }

    public void setNumeroPernaS(double numeroPernaS) {
        this.numeroPernaS = numeroPernaS;
    }
}
