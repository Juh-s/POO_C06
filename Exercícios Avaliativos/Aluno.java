package br.inatel.poo.turmas;

public class Aluno {
    public String nome;
    public String matricula;
    public double[] notas;

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calculaMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Media: %.2f%n", calculaMedia());
        System.out.println("---------------------------");
    }
}