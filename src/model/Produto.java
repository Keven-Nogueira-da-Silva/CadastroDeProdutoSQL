package model;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(int id, String nome, double preco, int quantidade) {
        this(nome, preco, quantidade);
        this.id = id;
    }

    // Getters e Setters

    public int getId() { return id; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    public void setId(int id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", preço=" + preco + ", quantidade=" + quantidade + "]";
    }
}

