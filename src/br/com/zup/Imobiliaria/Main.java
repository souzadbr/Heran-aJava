package br.com.zup.Imobiliaria;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Imobiliaria imobiliaria = new Imobiliaria();


        Funcionarios funcionario = new Funcionarios("Debora","123456");
        Imovel imovel1 = new Imovel("Rua Data", 2500,funcionario);


        Moradores morador1 = new Moradores("Walter","14587");
        Moradores morador2 = new Moradores("Katia","14587");
        Moradores morador3 = new Moradores("Bianca","12548");

        imovel1.adicionarMorador(morador1);
        imovel1.adicionarMorador(morador2);
        imovel1.adicionarMorador(morador3);

        imobiliaria.adicionarImovel(imovel1);


        Funcionarios funcionario1 = new Funcionarios("DRita","125489");
        Imovel imovel2 = new Imovel("Rua Queiroz", 45000,funcionario);


        Moradores morador4 = new Moradores("Karen","125899");
        Moradores morador5 = new Moradores("Yan","478996");
        Moradores morador6 = new Moradores("Jessica","144477788");

        imovel2.adicionarMorador(morador4);
        imovel2.adicionarMorador(morador5);
        imovel2.adicionarMorador(morador6);


        imobiliaria.adicionarImovel(imovel2);
        System.out.println(imobiliaria.toString());

        imobiliaria.buscarImovel("Rua Queiroz","125899");
        System.out.println("-----------------------------------");
        System.out.println(imobiliaria.toString());




    }
}
