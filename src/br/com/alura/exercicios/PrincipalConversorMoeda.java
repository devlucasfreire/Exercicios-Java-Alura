package br.com.alura.exercicios;

import br.com.alura.modelos.ConversaoFinanceira;
import br.com.alura.modelos.ConversorMoeda;

import java.util.Scanner;

public class PrincipalConversorMoeda {
    public static void main(String[] args) {


        System.out.println("Sistema de conversão de meodas! ");


        ConversorMoeda conversor = new ConversorMoeda();

        conversor.setValorDolar(200);
        conversor.setPrecoReal(5.32);
        conversor.converterDolarParaReal();

        double resultado = conversor.converterDolarParaReal();
        System.out.println("O valor em reais é: R$ " + resultado);

    }
}
