package br.com.alura.exercicios;

import br.com.alura.modelos.IdadePessoa;

public class PrincipalPessoa {
    public static void main(String[] args) {

        IdadePessoa pessoaIdade = new IdadePessoa();

        pessoaIdade.setNome("Lucas Lopes Freire");
        pessoaIdade.setIdade(22);

        System.out.println("Nome cadastrado: " + pessoaIdade.getNome());
        System.out.println("Idade cadastrada: " + pessoaIdade.getIdade());

        pessoaIdade.verificarIdade();

    }


}
