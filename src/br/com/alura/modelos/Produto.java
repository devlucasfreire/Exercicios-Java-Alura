package br.com.alura.modelos;

public class Produto {

    private String nomeProduto;
    private double precoProduto;


    public String getNome() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void aplicarDesconto(double percentual){
        if (precoProduto > 60) {
            if (percentual > 15) {
                System.out.println("Desconto acima do permitido!");
            } else {
                this.precoProduto = precoProduto - (precoProduto * percentual / 100);
                System.out.printf("O produto entrou em desconto! Preço atual: %.2f%n", precoProduto);
            }
        } else {
            System.out.println("Valor abaixo do disponível para desconto!");
        }

    }
}
