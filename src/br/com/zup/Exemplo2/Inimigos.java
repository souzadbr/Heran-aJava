package br.com.zup.Exemplo2;

public class Inimigos {
    private String nome;
    private String cor;
    private String tipoAtaque;
    private int vida;

    public Inimigos(String nome, String cor, String tipoAtaque, int vida) {
        this.nome = nome;
        this.cor = cor;
        this.tipoAtaque = tipoAtaque;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(String tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
