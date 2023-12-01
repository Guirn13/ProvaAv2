package br.com.prova;


public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String descProduto;
    private int estoqueAtual;
    private Categoria categoria;

    // Construtor
    public Produto(String nomeProduto, double precoProduto, String descProduto, int estoqueAtual, Categoria categoria) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.descProduto = descProduto;
        this.estoqueAtual = estoqueAtual;
        this.categoria = categoria;
    }

    // Método para buscar um produto
    public boolean buscarProduto(Produto produto) {
        // Compara o nome do produto com o nome do produto passado como parâmetro
        return this.nomeProduto.equals(produto.getNomeProduto());
    }

    // Outros métodos, getters e setters

    // Getter para o nome do produto
    public String getNomeProduto() {
        return nomeProduto;
    }

    // Setter para o nome do produto
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    // Getter para o preço do produto
    public double getPrecoProduto() {
        return precoProduto;
    }

    // Setter para o preço do produto
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    // Getter para a descrição do produto
    public String getDescProduto() {
        return descProduto;
    }

    // Setter para a descrição do produto
    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    // Getter para o estoque atual do produto
    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    // Setter para o estoque atual do produto
    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    // Getter para a categoria do produto
    public Categoria getCategoria() {
        return categoria;
    }

    // Setter para a categoria do produto
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

