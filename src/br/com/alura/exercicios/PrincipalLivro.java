package br.com.alura.exercicios;

import br.com.alura.modelos.Livro;

public class PrincipalLivro {
    public static void main(String[] args) {


        Livro meuLivro = new Livro();

        meuLivro.setTituloLivro("A Paciente Silenciosa");
        meuLivro.setNomeAutor("Alex Michaelides");

        meuLivro.exbirDetalhesLivro();

    }
}
