package br.com.alura.exercicios;
import br.com.alura.modelos.ConversorTemperaturaPadrao;

public class PrincipalTemperatura {
    public static void main(String[] args) {

        ConversorTemperaturaPadrao converter = new ConversorTemperaturaPadrao();

        converter.celsiusParaFahrenheit(29);
        converter.fahrenheitParaCelsius(84);

    }

}
