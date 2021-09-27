package br.com.zup.Imobiliaria;

public class Moradores extends Pessoas{
    public Moradores(String nome) {
        super(nome);
    }
    @Override
    public String toString (){
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n - "+ getNome());
        return retorno.toString();
    }

}
