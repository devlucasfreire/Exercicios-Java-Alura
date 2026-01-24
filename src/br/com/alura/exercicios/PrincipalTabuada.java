package br.com.alura.exercicios;
import br.com.alura.modelos.TabuadaMultiplicacao;

public class PrincipalTabuada {
    static void main(String[] args) {

        System.out.println("Sistema de tabuada!");

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();

        tabuada.mostrarTabuada(5);


    }
}
