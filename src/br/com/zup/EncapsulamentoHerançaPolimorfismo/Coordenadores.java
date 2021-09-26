package br.com.zup.EncapsulamentoHerançaPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionários {
    private Professores profSupervisionados;

    private List <Professores> profSupervisionado = new ArrayList<>();

    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLoacao, double salario, Professores profSupervisionados, List<Professores> profSupervisionado) {
        super(nome, cpf, numeroRegistro, orgaoLoacao, salario);
        this.profSupervisionados = profSupervisionados;
        this.profSupervisionado = profSupervisionado;
    }

    @Override
    public double aumentoSalario (){
        return getSalario()*1.05;
    }

}
