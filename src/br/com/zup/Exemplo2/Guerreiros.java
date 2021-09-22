package br.com.zup.Exemplo2;

public class Guerreiros extends Heroi {
    private String arma;
    private int dano = 20;

    public Guerreiros(String poder, String proteção, String nome, int vida, String arma) {
        super(poder, proteção, nome, vida);
        this.arma = arma;
    }
    public void perderVida(int dano){
     int aplicaDano = this.getVida()-dano;
     this.setVida(aplicaDano);
    }
}

