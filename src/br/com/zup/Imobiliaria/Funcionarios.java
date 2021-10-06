package br.com.zup.Imobiliaria;

public class Funcionarios extends Pessoas{
    private String ctps;

    public Funcionarios(String nome, String cpf, String ctps) {
        super(nome, cpf);
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Override
    public String toString (){
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("\n Carteira de trabalho: "+ctps);
        return retorno.toString();
    }
}
