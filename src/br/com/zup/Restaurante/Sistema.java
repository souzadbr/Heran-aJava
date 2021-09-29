package br.com.zup.Restaurante;

import java.util.Scanner;

public class Sistema {

    //Método que automatiza entrada de dados - unico metodo privado desse programa.
    private static Scanner capturaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Exibir menu
    public static void menu() {
        System.out.println("Bem Vindo ao restaurando Da Dé!");
        System.out.println("Digite 1 - Para cadastrar um Prato e seus ingredientes. ");
        System.out.println("Digite 2 - Para exibir informações dos Prados cadastrados. ");
        System.out.println("Digite 3 - Para sair. ");

    }

    //Metodo que cadastra Pratos
    public static Pratos cadastrarPratos() {
        String nome = capturaDados("Digite o nome do Prato: ").nextLine();
        double valorPrato = capturaDados("Digite o preço do Prato: R$").nextDouble();
        Pratos prato = new Pratos(nome, valorPrato);
        return prato;

    }

    //Metodo cadastrar ingrediente
    public static Ingredientes cadastrarIngredientes() {
        Pratos prato = new Pratos();
        String nome = capturaDados("Digite o ingredientes da lista: ").nextLine();
        Ingredientes ingredientes = new Ingredientes(nome);
        prato.addIngrediente(ingredientes);
        return ingredientes;
    }
    //Método resposavel juntar tudo

    public static void executar() {
        boolean menu = true;
        Cardapio cardapio = new Cardapio();

        while (menu) {


            menu();
            int opcaoUsuario = capturaDados("Digite a opção desejada: ").nextInt();

            if (opcaoUsuario == 1) {
                Pratos prato = cadastrarPratos();
                cardapio.adicionarPrato(prato);

                int qtdIngredientes = capturaDados("Digite a quantidade de ingredientes desse Prato: ").nextInt();
                for (int i = 0; i < qtdIngredientes; i++) {
                    Ingredientes ingredientes = cadastrarIngredientes();
                    prato.addIngrediente(ingredientes);

                }


            } else if (opcaoUsuario == 2) {
                System.out.println(cardapio);
            } else if (opcaoUsuario == 3) {
                System.out.println("Volte sempre!");
                break;
            }
        }
    }
}