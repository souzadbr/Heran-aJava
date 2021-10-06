package br.com.zup.Imobiliaria;


import java.util.Scanner;

// O sistema deve permitir remover um morador de um imóvel específico
// O sistema não pode permitir adicionar um morador com CPF repetido
public class Sistema {

    // Método responsável por automatizar a entrada de dados
    // Outra forma de receber os dados do usuário

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Método resposavel por cadastrar imovel de tipo Imovel - recebe dados do imovel
    public static Imovel cadastrarImovel() {
        String endereçoImovel = capturarDados("Digite o endereço do imóvel: ").nextLine();
        double valorAluguel = capturarDados("Digite o valor do Aluguel: ").nextDouble();

        //Estanciar um imovel para receber os dados coletados acima
        Imovel imovel = new Imovel(endereçoImovel, valorAluguel);
        return imovel;
    }

    //Método rsposavel por cadastrar funcionário resposavel tipo Funcionarios - recebe dado de funcionario

    public static Funcionarios cadastrarFuncionario() {
        String nome = capturarDados("Digite o nome do funcionário responsavel: ").nextLine();
        String cpf = capturarDados("Digite o CPF do funcionário resposavel: ").nextLine();
        String ctps = capturarDados("Digite a carteira de trabalho do funcionário responsavel: ").nextLine();

        //Estanciar 1 funcionarios comd ados recebidos
        Funcionarios funcionarios = new Funcionarios(nome, cpf, ctps);
        //retornar funcionario
        return funcionarios;
    }

    //Método resposavel por receber os dados que serão usados no metodo cadastrar morador
    public static Morador receberDadosdosMoradores() {
        String nome = capturarDados("Digite seu nome: ").nextLine();
        String cpf = capturarDados("Digite seu CPF: ").nextLine();
        String telefone = capturarDados("Digite seu telefone: ").nextLine();
        Double renda = capturarDados("Digite seu salario: ").nextDouble();
        String email = capturarDados("Digite um email : ").nextLine();

        Morador morador = new Morador(nome, cpf, telefone, renda, email);
        return morador;
    }


    //validação CPF - recebendo Imobiliaria e moradores para verificar todos os dados dentro da imobiliaria - será usado no metodo cadastrar morador
    private static boolean validarCpfExistente(Imobiliaria imobiliaria, Morador morador) {
        //Percorrer minha lista de imoveis
        String cpf = morador.getCpf();
        for (Imovel percorrerImovel : imobiliaria.getImoveis()) {
            //Percorrer todas as listas de moradores
            for (Morador percorrerMoradopres : percorrerImovel.getMoradores()) {
                if (percorrerMoradopres.getCpf().equals(cpf)) {
                    //Este morador possui CPF já cadastrado

                    return true;
                }
            }
        }
        return false;
    }

    //Validação de email existente
    private static boolean validarEmailExistente(Imobiliaria imobiliaria, Morador morador) {
        String email = morador.getEmail();
        for (Imovel percorrerImovel : imobiliaria.getImoveis()) {
            //Percorrer toda a lista de moradores
            for (Morador percorrerMoradores : percorrerImovel.getMoradores()) {
                if (percorrerMoradores.getEmail().equals(email)) {
                    //Este email já existe cadastrado no sistema.
                    System.out.println("Email já existe no sistema");
                    return true;
                } else if (percorrerMoradores.getEmail().contains("@")) {
                    //Este meail é invalido
                    System.out.println("Este email é inválido");
                    return true;
                }
            }

        }
        return false;
    }


    //Cadastrar moradores fazendo a validação de cpf do método acima e usando os dados recebidos no método acima
    public static void cadastrarMoradores(Imobiliaria imobiliaria, Imovel imovel) {
        int quantidadeMoradores = capturarDados("Digite a quantidade de moradores a ser cadastrado: ").nextInt();
        int contadorDeMoradores = 0;

        while (contadorDeMoradores < quantidadeMoradores) {
            Morador morador = receberDadosdosMoradores();
            boolean cpfExistente = validarCpfExistente(imobiliaria, morador);


            if (cpfExistente == true) {

                System.out.println("CPF já é cadastrado no sistema.");

            } else {
                imovel.adicionarMorador(morador);
                contadorDeMoradores++;

                System.out.println("Morador " + contadorDeMoradores + " cadastrado com sucesso");

            }
        }

    }

    //Método que remove morador de 1 imovel por CPF/ por ter responsabilidade
    // unica não precisa ter uma variavel para receber o que vai ser  excluido apenas retornar e sair do método.
    public static String removerMoradorPorCpf(Imobiliaria imobiliaria) {
        //receber CPF do morador a ser excluido
        String cpf = capturarDados("Digite o CPF do morador a ser removido: ").nextLine();

        //Percorrer lista imoveis acessando lista dentro da imobiliaria
        for (Imovel percorrerImoveis : imobiliaria.getImoveis()) {
            //Percorrer todas as listas de moradores dentro da classe imoveis
            for (Morador percorrerMoradores : percorrerImoveis.getMoradores()) {
                percorrerImoveis.getMoradores().remove(percorrerMoradores);
                return "Morador foi removido com sucesso";
            }
        }
        return "Morador cadastrado no sistema";
    }


    //Exibir escolhas menu
    public static void menu() {
        System.out.println("Bem vindo a imobiliaria da Dé");
        System.out.println("Digite 1 - Para cadastrar um imovel. ");
        System.out.println("Digite 2 - Para exibir os imoveis cadastrados. ");
        System.out.println("Digite 3 - Para remover um morador utilizando o CPF. ");
        System.out.println("Digite 4 - Para sair. ");
    }

    //Método executar que junta tudo
    public static void executar() {
        boolean menu = true;
        Imobiliaria imobiliaria = new Imobiliaria();

        while (menu) {

            //chamando metodo menu
            menu();
            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();

            if (opcaoDoUsuario == 1) {
                Imovel imovel = cadastrarImovel();
                imobiliaria.adicionarImovel(imovel);
                System.out.println("--------------");
                System.out.println("Imovel cadastrado com sucesso.");
                System.out.println("--------------");
                Funcionarios funcionarios = cadastrarFuncionario();
                imovel.setFuncionario(funcionarios);
                System.out.println("--------------");
                System.out.println("Funcionário cadastrado com sucesso.");
                System.out.println("--------------");
                cadastrarMoradores(imobiliaria, imovel);


            } else if (opcaoDoUsuario == 2) {
                System.out.println(imobiliaria);
            } else if (opcaoDoUsuario == 3) {
                //Para deixar o código mais limpo e mais facil a manutenção criar uma variavel para receber o retorno do metodo
                String mensagemDaRemoção = removerMoradorPorCpf(imobiliaria);
                System.out.println(mensagemDaRemoção);
            } else if (opcaoDoUsuario == 4) {
                System.out.println("Obrigada, voltei sempre");
                //menufalse para sair
                menu = false;
            }


        }


    }

}

