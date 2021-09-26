package br.com.zup.EncapsulamentoHerançaPolimorfismo;

public class FuncionáriosAdm extends Funcionários {
    private String funcaoAdm;
    private String senioridade;

    public FuncionáriosAdm(String nome, String cpf, String numeroRegistro, String orgaoLoacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, cpf, numeroRegistro, orgaoLoacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }
}
