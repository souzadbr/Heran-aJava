package br.com.zup.EncapsulamentoHerançaPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionários {

    private List<Professores> profSupervisionado = new ArrayList<>();

    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLoacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLoacao, salario);

    }

    public void adicionarProfessor(Professores prof) {

        if (profSupervisionado.size() < 2) {
            profSupervisionado.add(prof);
            System.out.println("Adicionado com sucesso");
        } else {
            System.out.println("Estamos no limite de professores a serem supervisionados");
        }
    }

    public void exibirProfessoresSupervicionados() {
        for (Professores referencia : profSupervisionado) {
            System.out.println("O nome do professor é: " + referencia.getNome());

        }
    }

    public void removerProfessorSupervisionado (Professores prof){

        profSupervisionado.remove(prof);
    }
    @Override
    public double aumentoSalario() {
        return getSalario() * 1.05;
    }

}
