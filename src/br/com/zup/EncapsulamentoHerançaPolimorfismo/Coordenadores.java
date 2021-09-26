package br.com.zup.EncapsulamentoHerançaPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionários {
    private Professores profSupervisionados;

    private List<Professores> profSupervisionado = new ArrayList<>();

    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLoacao, double salario, Professores profSupervisionados, List<Professores> profSupervisionado) {
        super(nome, cpf, numeroRegistro, orgaoLoacao, salario);
        this.profSupervisionados = profSupervisionados;
        this.profSupervisionado = profSupervisionado;
    }

    public void adicionarProfessor(Professores prof) {
        profSupervisionado.add(prof);
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
