package br.com.zup.Exemplo2;

public class Heroi {
    private String poder;
    private String proteção;
    private String nome;
    private int vida;

    public Heroi(String poder, String proteção, String nome, int vida) {
        this.poder = poder;
        this.proteção = proteção;
        this.nome = nome;
        this.vida = vida;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getProteção() {
        return proteção;
    }

    public void setProteção(String proteção) {
        this.proteção = proteção;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
