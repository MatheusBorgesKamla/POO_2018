public class Invoice {

    private int numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Invoice(int numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        if (quantidade < 0)
            this.quantidade = 0;
        else
            this.quantidade = quantidade;

        if (preco < 0.0)
            this.preco = 0.0;
        else
            this.preco = preco;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getInvoiceAmount() {
        double preco_final = quantidade * preco;
        return preco_final;
    }

}