package br.com.alura.exercicios;

import br.com.alura.modelos.Animal;
import br.com.alura.modelos.Cachorro;
import br.com.alura.modelos.Gato;

public class PrincipalAnimal {
    public static void main(String[] args) {


        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Peter");
        cachorro.setIdade(7);
        cachorro.setRaca("Chiuaua");

        cachorro.informacoesAnimais();

        cachorro.abanarRabo();
        cachorro.emitirSom();

        Gato gato = new Gato();

        gato.setNome("Noemi");
        gato.setIdade(3);
        gato.setRaca("Maine Coon");

        gato.informacoesAnimais();

        gato.emitirSom();
        gato.arranharMoveis();


    }

}
