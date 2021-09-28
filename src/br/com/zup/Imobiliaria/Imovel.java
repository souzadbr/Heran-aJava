package br.com.zup.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String enderecoImovel;
    private double valorAluguel;
    private Funcionarios funcionario;
    private List<Moradores>moradores = new ArrayList<>();

    public Imovel() {

    }
    public Imovel(String enderecoImovel, double valorAluguel, Funcionarios funcionario) {
        this.enderecoImovel = enderecoImovel;
        this.valorAluguel = valorAluguel;
        this.funcionario = funcionario;
        this.moradores = moradores;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public void setEnderecoImovel(String enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

    public List<Moradores> getMoradores() {
        return moradores;
    }

    public void adicionarMorador(Moradores morador){
        moradores.add(morador);
    }
    @Override
    public String toString (){
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Endereço imóvel: "+enderecoImovel);
        retorno.append("\n Valor alugel: "+ valorAluguel);
        retorno.append("\n Moradores: "+moradores);
        retorno.append("\n Quantidade de moradores: "+ moradores.size());
        retorno.append("\n Funcionario resposavel: "+funcionario);
        return retorno.toString();
    }

}
