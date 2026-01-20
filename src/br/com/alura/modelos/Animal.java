package br.com.alura.modelos;

public class Animal {
    private String nome;
    private int idade;
    private String raca;

    public void emitirSom() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void informacoesAnimais() {
        System.out.println("Nome do animal: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Raça: " + getRaca());

        exibirOutrosDetalhes();
    }

    public void exibirOutrosDetalhes() {

    }
 }
