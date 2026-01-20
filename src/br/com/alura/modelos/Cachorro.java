package br.com.alura.modelos;
import br.com.alura.modelos.Animal;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("au au");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo de felicidade");
    }

 }
