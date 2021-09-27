package br.com.zup.EncapsulamentoHerançaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Professores professor1 = new Professores("Debora", "3505874451", "125", "STF", 25000, "Mestrado", "Java", 30);
        Professores professor2 = new Professores("Walter", "21547896", "125", "SFT", 26000, "Mestrado", "JavaScript", 32);
        Professores professor3 = new Professores("Bianca", "125478963", "145", "STF", 27000, "Graduado", "CSS", 29);
        Professores professor4 = new Professores("Alexandra", "3546987", "143", "STF", 26000, "Graduado", "Java", 1);

        Turma turma1 = new Turma(30, 2);
        Turma turma2 = new Turma(40, 2);

        Coordenadores coordenador = new Coordenadores("Barbara", "21548963", "147", "STF", 55000);

        coordenador.adicionarProfessor(professor1);
        coordenador.adicionarProfessor(professor2);
        coordenador.adicionarProfessor(professor3);
        //coordenador.adicionarProfessor(professor4);
        //coordenador.exibirProfessoresSupervicionados();
        System.out.println("------------");
        coordenador.aumentoSalario();
        System.out.println("O salario do coordenador com 5% de acrescimo é: ");
        System.out.println(coordenador.aumentoSalario());
        System.out.println("Os professores supervisionados pelo coordenador são: ");
        coordenador.exibirProfessoresSupervicionados();

        System.out.println("------------");
        professor1.adicionarTurma(turma1);
        professor1.adicionarAlunos();
        System.out.println("A quantidade de alunos que o professor dá aula é: ");
        System.out.println(professor1.qtdAlunos());
        System.out.println("O salario do professor com 10% de acrescimento é: ");
        System.out.println(professor1.aumentoSalario());

    }

}
