package br.com.zup.Restaurante;

import java.util.Scanner;

public class Sistema {

    //Método que automatiza entrada de dados
    private static Scanner capsturaDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
}
