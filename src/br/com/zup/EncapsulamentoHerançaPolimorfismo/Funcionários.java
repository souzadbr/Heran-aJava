package br.com.zup.EncapsulamentoHerançaPolimorfismo;

public class Funcionários {
    private String nome;
    private String cpf;
    private String numeroRegistro;
    private String orgaoLoacao;
    private double salario;

    public Funcionários(String nome, String cpf, String numeroRegistro, String orgaoLoacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLoacao = orgaoLoacao;
        this.salario = salario;
    }
}
