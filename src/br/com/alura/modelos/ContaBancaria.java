package br.com.alura.modelos;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void sacar(double valor){
        if (valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Saldo restante: " + this.saldo);
        } else {
            System.out.println("Valor de saque inválido.");
        }

    }
    public void depositar(double valor) {
        if(valor < 0) {
            System.out.println("Erro, não é possível depositar valores negativos ou valores iguais a 0");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso! Saldo atualizado:  " + this.saldo);
        }
    }

    public void consultarSaldo(){

    }

    public void exibirInformacoes() {
        System.out.println("Número de conta: " + getNumeroConta());
        System.out.println("Títular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());

    }




}
