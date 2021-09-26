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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getOrgaoLoacao() {
        return orgaoLoacao;
    }

    public void setOrgaoLoacao(String orgaoLoacao) {
        this.orgaoLoacao = orgaoLoacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
