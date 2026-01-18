package br.com.alura.modelos;

public class Aluno {
    private String nome;
    private double somaNotas;
    private int totalNotas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double nota) {
        if (nota > 10 || nota < 0) {
            System.out.println("Erro: Nota " + nota + " é inválida! Use valores entre 0 e 10.");
        } else {
            this.somaNotas += nota;
            this.totalNotas++;
            System.out.println("Nota " + nota + " adicionada com sucesso.");
        }
    }

    public double calcularMedia() {
        if (totalNotas == 0) return 0;
        return somaNotas / totalNotas;
    }

    public void exibirRelatorio() {
        System.out.println("\n--- RELATÓRIO DO ALUNO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Total de notas inseridas: " + totalNotas);
        System.out.printf("Média Final: %.2f%n", calcularMedia());

        if (calcularMedia() >= 7) {
            System.out.println("Status: APROVADO!");
        } else {
            System.out.println("Status: REPROVADO.");
        }
    }
}