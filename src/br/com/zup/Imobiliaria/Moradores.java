package br.com.zup.Imobiliaria;

public class Moradores extends Pessoas{
    public Moradores(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String toString (){
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n - "+ getNome());
        retorno.append("\n - "+getCpf());
        return retorno.toString();
    }

}
