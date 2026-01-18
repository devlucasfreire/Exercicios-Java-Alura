package br.com.alura.exercicios;

import br.com.alura.modelos.Aluno;

public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno meuAluno = new Aluno();

        meuAluno.setNome("Lucas Lopes Freire");


        meuAluno.setNotas(9.5);
        meuAluno.setNotas(10.0);
        meuAluno.setNotas(5.5);


        meuAluno.exibirRelatorio();
    }
}