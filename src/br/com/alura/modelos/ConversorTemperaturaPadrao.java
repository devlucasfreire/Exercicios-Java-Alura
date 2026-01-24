package br.com.alura.modelos;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{


    @Override
    public void celsiusParaFahrenheit(double tempC) {
        double formula = (tempC * 9/5) + 32;
        System.out.println("Temperatura Celsius em Fahrenheit: " + formula);


    }

    @Override
    public void fahrenheitParaCelsius(double tempF) {
        double formula = (tempF -32 ) * 5 /9;
        System.out.printf("Temperatura Fahrenheit em Celsius: %.2f", formula);
    }
}
