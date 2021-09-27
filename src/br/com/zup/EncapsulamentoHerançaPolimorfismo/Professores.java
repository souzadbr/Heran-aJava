package br.com.zup.EncapsulamentoHerançaPolimorfismo;

public class Professores extends Funcionários {
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;
    private Turma turma;


    public Professores(String nome, String cpf, String numeroRegistro, String orgaoLoacao, double salario, String nivelGraduacao, String disciplinaMinistrada) {
        super(nome, cpf, numeroRegistro, orgaoLoacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdTurmas = qtdTurmas;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    public void adicionarAlunos(){
        qtdAlunos = qtdAlunos + turma.getQuantidadeDeAluno();
    }
    public String qtdAlunos() {
        return "Quantidade de aluno: " + qtdAlunos;
    }

    public void adicionarTurma (Turma turmaAdicionada){
        turma = turmaAdicionada;

    }


}


