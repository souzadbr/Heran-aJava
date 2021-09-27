package br.com.zup.Imobiliaria;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Imobiliaria imobiliaria = new Imobiliaria();


        Funcionarios funcionario = new Funcionarios("Debora");
        Imovel imovel1 = new Imovel("Rua Data", 2500,funcionario);


        Moradores morador1 = new Moradores("Walter");
        Moradores morador2 = new Moradores("Katia");
        Moradores morador3 = new Moradores("Bianca");

        imovel1.adicionarMorador(morador1);
        imovel1.adicionarMorador(morador2);
        imovel1.adicionarMorador(morador3);

        imobiliaria.adicionarImovel(imovel1);


        Funcionarios funcionario1 = new Funcionarios("DRita");
        Imovel imovel2 = new Imovel("Rua Queiroz", 45000,funcionario);


        Moradores morador4 = new Moradores("Karen");
        Moradores morador5 = new Moradores("Yan");
        Moradores morador6 = new Moradores("Jessica");

        imovel2.adicionarMorador(morador4);
        imovel2.adicionarMorador(morador5);
        imovel2.adicionarMorador(morador6);


        imobiliaria.adicionarImovel(imovel2);
        System.out.println(imobiliaria.toString());







    }
}
