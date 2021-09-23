package br.com.zup.ExercicioHeranca;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Debora","Rosalia Sadoval", "2013654", 800, 500);
        System.out.println("O saldo do Fornecedor é valor 800 - 500 = 300 ");
        System.out.println(fornecedor.obterSaldo());
        fornecedor.setValorDivida(800);
        System.out.println("O saldo do Fornecedor é valor 800 - 800 = 0 ");
        System.out.println(fornecedor.obterSaldo());
        fornecedor.setValorCredito(1000);
        System.out.println("O saldo do Fornecedor é valor 1000 - 800 = 200 ");
        System.out.println(fornecedor.obterSaldo());


        Colaborador colaborador = new Colaborador("Debora", "Rosalia Sandoval", "12345612", 25, 2500, 100);
        System.out.println("Salario base de um Colaborador é de 2500 - 100 de imposto = 2400");
        System.out.println( colaborador.calcularSalario());
        System.out.println("Salario base de um Colaborador é de 2500 - 500 de imposto = 2000");
        colaborador.setImposto(500);
        System.out.println( colaborador.calcularSalario());


        Administrador administrador = new Administrador("Debora", "Rosalia Sandoval", "1234587", 30, 3000, 100, 100);
        System.out.println("O salario do Administrador é: 3000 salario base - 100 de imposto + 100 de ajuda de custo = 3000");
        System.out.println(administrador.calcularSalario());
        administrador.setAjudaDecusto(500);
        System.out.println("O salario do Administrador é: 3000 salario base - 100 de imposto + 500 de ajuda de custo = 3400");
        System.out.println(administrador.calcularSalario());

    }
}
