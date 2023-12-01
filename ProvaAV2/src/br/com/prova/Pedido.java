package br.com.prova;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private List<PedidoItem> itensPedido;

    // Construtor
    public Pedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
        this.itensPedido = new ArrayList<>();
    }

    // Método para inserir um novo pedido
    // (Construtor conforme solicitado)
    public Pedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido, List<PedidoItem> itensPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
        this.itensPedido = itensPedido;
    }

    // Método para alterar o status do pedido
    public void alterarStatus(int novoStatus) {
        this.statusPedido = novoStatus;
        System.out.println("Status do pedido alterado para: " + novoStatus);
    }

    // Método para consultar o pedido
    public boolean consultarPedido(Pedido pedido) {
        return this.numeroPedido == pedido.getNumeroPedido();
    }

    // Método para inserir itens no pedido
    public void inserirItensPedido(PedidoItem item) {
        this.itensPedido.add(item);
        System.out.println("Item do pedido inserido com sucesso!");
    }

    // Método para excluir itens do pedido
    public void excluirItensPedido(PedidoItem item) {
        if (this.itensPedido.contains(item)) {
            this.itensPedido.remove(item);
            System.out.println("Item do pedido excluído com sucesso!");
        } else {
            System.out.println("Item do pedido não encontrado!");
        }
    }

    // Método para calcular o total a pagar
    public double calcularTotalPagar() {
        double total = 0.0;
        for (PedidoItem item : itensPedido) {
            total += item.getPrecoItem();
        }
        return total;
    }

    // Outros métodos, getters e setters

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public List<PedidoItem> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<PedidoItem> itensPedido) {
        this.itensPedido = itensPedido;
    }
}
