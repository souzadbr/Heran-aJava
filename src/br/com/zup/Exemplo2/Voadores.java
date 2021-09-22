package br.com.zup.Exemplo2;

public class Voadores extends Inimigos {
    private double velocidadedeVoo;
    private int dano = 80;

    public Voadores(String nome, String cor, String tipoAtaque, int vida, double velocidadedeVoo) {
        super(nome, cor, tipoAtaque, vida);
        this.velocidadedeVoo = velocidadedeVoo;
    }

    public double getVelocidadedeVoo() {
        return velocidadedeVoo;
    }

    public void setVelocidadedeVoo(double velocidadedeVoo) {
        this.velocidadedeVoo = velocidadedeVoo;
    }

    public int aplicarDano(){
        return  dano;
    }
}
