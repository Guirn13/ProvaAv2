package br.com.prova;

import java.util.List;

public class PedidoItem {
    private String nomeItem;
    private int qtdeItem;
    private double precoItem;

    // Construtor
    public PedidoItem(String nomeItem, int qtdeItem, List<Produto> listaProdutos) {
        this.nomeItem = nomeItem;
        this.qtdeItem = qtdeItem;
        this.precoItem = precoItem;
        this.listaProdutos = listaProdutos;
    }


    // Lista de produtos
    private List<Produto> listaProdutos;


    // Método para atualizar o estoque do item
    public void atualizaEstoqueItem() {
        Produto produtoAssociado = null;

        for (Produto produto : listaProdutos) {
            if (produto.getNomeProduto().equalsIgnoreCase(nomeItem)) {
                produtoAssociado = produto;
                break;
            }
        }

        // Verifica se o produto foi encontrado
        if (produtoAssociado != null) {
            // Atualiza o estoque do produto
            int novoEstoque = produtoAssociado.getEstoqueAtual() - qtdeItem;
            produtoAssociado.setEstoqueAtual(novoEstoque);
            System.out.println("Estoque atualizado para o produto: " + produtoAssociado.getNomeProduto());
        } else {
            System.out.println("Produto associado não encontrado. Estoque não atualizado.");
        }
    }

    // Métodos getters e setters

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQtdeItem() {
        return qtdeItem;
    }

    public void setQtdeItem(int qtdeItem) {
        this.qtdeItem = qtdeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
}
