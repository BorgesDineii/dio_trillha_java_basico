package Carrinho_de_Compras;

public class Item {
    private String item;

    private String nome;

    private double preco;

    private int quantidade;

    public String getItem() {
        return item;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Item(String item, String nome, double preco, int quantidade) {
        this.item = item;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item [item=" + item + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    
}
