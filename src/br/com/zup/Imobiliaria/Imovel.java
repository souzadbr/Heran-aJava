package br.com.zup.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String enderecoImovel;
    private double valorAluguel;
    private Funcionarios funcionario;
    private List<Morador>moradores = new ArrayList<>();

    public Imovel (String endereço, double valorAluguel){
        this.enderecoImovel = endereço;
        this.valorAluguel = valorAluguel;
    }

    public Imovel(String enderecoImovel, double valorAluguel, Funcionarios funcionario) {
        this.enderecoImovel = enderecoImovel;
        this.valorAluguel = valorAluguel;
        this.funcionario = funcionario;
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

    public List<Morador> getMoradores() {

        return moradores;
    }

    public void adicionarMorador(Morador novoMorador){
        moradores.add(novoMorador);
    }

    public void setMoradores (List<Morador>moradores){
        this.moradores=moradores;
    }

   // public void adicionarMorador(Moradores morador){
   //     boolean cpfRepetido = false;
   //     for (Moradores referencia: moradores) {
   //         if(referencia.getCpf().equals(morador.getCpf())){
   //             cpfRepetido = true;
    //            System.out.println("Cpf Repetido");
    //        }
   //     }
   //    if ( cpfRepetido == false ) {
  //         moradores.add(morador);
  //     }

   // }

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
