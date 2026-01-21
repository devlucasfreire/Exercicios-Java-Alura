package br.com.alura.exercicios;

import br.com.alura.modelos.ModeloCarro;

public class PrincipalCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}
