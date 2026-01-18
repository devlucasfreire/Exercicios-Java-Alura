package br.com.alura.modelos;

public class Livro {

    private String tituloLivro;
    private String nomeAutor;

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public void exbirDetalhesLivro() {
        System.out.println("---Detalhes do Livro---");
        System.out.println("Título do livro: " + tituloLivro);
        System.out.println("Autor " + nomeAutor);
    }
}
