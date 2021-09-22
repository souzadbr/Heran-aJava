package br.com.zup.Exemplo1;

public class TecnicoAdm extends Funcionario {
    private String cargo;

    public TecnicoAdm(String nome, double salario, String ctps, String cpf, String cargo) {
        super(nome, salario, ctps, cpf);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
