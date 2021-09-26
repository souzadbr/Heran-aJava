package br.com.zup.EncapsulamentoHerançaPolimorfismo;

public class Coordenadores extends Funcionários {
    private Professores profSupervisionados;

    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLoacao, double salario, Professores profSupervisionados) {
        super(nome, cpf, numeroRegistro, orgaoLoacao, salario);
        this.profSupervisionados = profSupervisionados;
    }

    public Professores getProfSupervisionados() {
        return profSupervisionados;
    }

    public void setProfSupervisionados(Professores profSupervisionados) {
        this.profSupervisionados = profSupervisionados;
    }
}
