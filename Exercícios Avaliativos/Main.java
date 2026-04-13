package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno a1 = new Aluno("Julia", "1", new double[]{8.0, 7.5, 9.0});
        Aluno a2 = new Aluno("Ana", "2", new double[]{9.5, 8.5, 10.0});
        Aluno a3 = new Aluno("Carlos", "3", new double[]{7.0, 6.0, 8.0});

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);

        turma.listarAlunos();

        Aluno melhor = turma.buscarMelhorAluno();

        if (melhor != null) {
            System.out.println("Melhor aluno: " + melhor.nome);
            System.out.printf("Media: %.2f%n", melhor.calculaMedia());
        }
    }
}