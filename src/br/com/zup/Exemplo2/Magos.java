package br.com.zup.Exemplo2;

public class Magos extends Heroi{
    private String magia;

    public Magos(String poder, String proteção, String nome, int vida, String magia) {
        super(poder, proteção, nome, vida);
        this.magia = magia;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }
}
