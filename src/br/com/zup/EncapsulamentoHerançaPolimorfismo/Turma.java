package br.com.zup.EncapsulamentoHerançaPolimorfismo;

public class Turma {
    private int quantidadeDeAluno;
    private int serie;

    public Turma(int quantidadeDeAluno, int serie) {
        this.quantidadeDeAluno = quantidadeDeAluno;
        this.serie = serie;
    }

    public int getQuantidadeDeAluno() {
        return quantidadeDeAluno;
    }

    public void setQuantidadeDeAluno(int quantidadeDeAluno) {
        this.quantidadeDeAluno = quantidadeDeAluno;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}
