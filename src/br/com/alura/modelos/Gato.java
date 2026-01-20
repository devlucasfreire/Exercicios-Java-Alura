package br.com.alura.modelos;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("MIAU, MIAU");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando móveis com as minhas garras!");
    }


}
