package br.com.zup.Imobiliaria;

public class Funcionarios extends Pessoas{
    public Funcionarios(String nome, String cpf) {
        super(nome, cpf);
    }
    @Override
    public String toString (){
        StringBuilder retorno = new StringBuilder();
        retorno.append(getNome());
        return retorno.toString();
    }
}
