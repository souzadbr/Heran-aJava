package br.com.zup.EncapsulamentoHerançaPolimorfismo;

public class Professores extends Funcionários{
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;

    public Professores(String nivelGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }
}
