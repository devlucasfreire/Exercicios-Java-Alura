package br.com.alura.exercicios;

import br.com.alura.modelos.Produto;

public class PrincipalProduto {
    public static void main(String[] args) {

        Produto meuProduto = new Produto();

        meuProduto.setNomeProduto("Café Gourmet São Lucas");
        meuProduto.setPrecoProduto(60.99);

        meuProduto.aplicarDesconto(15);

    }
}
