package br.com.alura.modelos;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 15.90;


    public void cobrarTarifaMensal() {
        System.out.println("Cobrando tarifa mensal...");
        sacar(tarifaMensal);
    }

}
