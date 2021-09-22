package br.com.zup.Exemplo1;

public class Inspetor extends Funcionario { //extendo cria uma relação de herança entre uma classe e outra

    private String supervisao;

    public Inspetor(String nome, double salario, String ctps, String cpf, String supervisao) {
        super(nome, salario, ctps, cpf); //super: falando que esses atributos são herdados da minha classe mãe
        this.supervisao = supervisao;
    }

    public String getSupervisao() {
        return supervisao;
    }

    public void setSupervisao(String supervisao) {
        this.supervisao = supervisao;
    }
}
