package br.com.zup.Imobiliaria;

public abstract class Pessoas {
    private String nome;
    private String cpf;

    public Pessoas(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }
    @Override
    public String toString (){
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome: "+nome);
        retorno.append("\n CPF: "+cpf);
        return retorno.toString();
    }
}
