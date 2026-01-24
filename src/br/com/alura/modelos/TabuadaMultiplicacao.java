package br.com.alura.modelos;

public class TabuadaMultiplicacao implements Tabuada {


    @Override
    public void mostrarTabuada(int valor) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(valor  + " X " + i  + " = " + valor * i);
        }
    }
}