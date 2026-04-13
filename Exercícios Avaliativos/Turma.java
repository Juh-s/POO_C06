package br.inatel.poo.turmas;

public class Turma {
    private int quantidadeAlunos;
    private Aluno[] alunos;

    public Turma() {
        alunos = new Aluno[10];
        quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        } else {
            System.out.println("Nao é possível adicionar mais alunos.");
        }
    }

    public void listarAlunos() {
        for (int i = 0; i < quantidadeAlunos; i++) {
            alunos[i].mostraInfo();
        }
    }

    public Aluno buscarMelhorAluno() {
        if (quantidadeAlunos == 0) {
            return null;
        }

        Aluno melhor = alunos[0];

        for (int i = 1; i < quantidadeAlunos; i++) {
            if (alunos[i].calculaMedia() > melhor.calculaMedia()) {
                melhor = alunos[i];
            }
        }

        return melhor;
    }
}