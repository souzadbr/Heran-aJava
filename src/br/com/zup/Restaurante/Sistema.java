package br.com.zup.Restaurante;

import java.util.Scanner;

public class Sistema {

    //Método que automatiza entrada de dados - unico metodo privado desse programa.
    private static Scanner capturaDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Exibir menu
    public static void menu (){
        System.out.println("Bem Vindo ao restaurando Da Dé!");
        System.out.println("Digite 1 - Para cadastrar um Prato e seus ingredientes. ");
        System.out.println("Digite 2 - Para exibir informações dos Prados cadastrados. ");
        System.out.println("Digite 3 - Para sair. ");

    }

}
