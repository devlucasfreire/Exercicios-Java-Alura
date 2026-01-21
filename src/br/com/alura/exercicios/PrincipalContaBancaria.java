package br.com.alura.exercicios;

import br.com.alura.modelos.ContaCorrente;
import br.com.alura.modelos.ContaBancaria;

public class PrincipalContaBancaria extends ContaBancaria{
    public static void main(String[] args) {


    ContaCorrente contaLucas = new ContaCorrente();



    contaLucas.setNumeroConta(4858458);
    contaLucas.setTitular("Lucas Lopes Freire");
    contaLucas.setSaldo(1000);

    contaLucas.exibirInformacoes();

    contaLucas.depositar(1000);
    contaLucas.sacar(500);
    contaLucas.setSaldo(200);
    contaLucas.cobrarTarifaMensal();
    contaLucas.exibirInformacoes();



    }


}
