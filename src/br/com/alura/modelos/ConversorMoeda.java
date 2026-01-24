package br.com.alura.modelos;

public class ConversorMoeda implements ConversaoFinanceira {
    private double valorDolar;
    private double precoReal;

    public double getPrecoReal() {
        return precoReal;
    }

    public void setPrecoReal(double precoReal) {
        this.precoReal = precoReal;
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    @Override
    public double converterDolarParaReal() {
        return valorDolar * precoReal;
    }

}
