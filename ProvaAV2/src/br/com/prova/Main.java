package br.com.prova;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // ArrayList de Produto: inserir 5 modelos de carros distintos.
        ArrayList<Produto> listaProdutos = new ArrayList<>(Arrays.asList(
                new Produto("Sedan1", 30000.0, "Carro Sedan espaçoso", 10, new Categoria("Sedan")),
                new Produto("SUV1", 35000.0, "Carro SUV versátil", 15, new Categoria("SUV")),
                new Produto("Esportivo1", 50000.0, "Carro Esportivo rápido", 8, new Categoria("Esportivo")),
                new Produto("Hatch1", 25000.0, "Carro Hatch ágil", 20, new Categoria("Hatch")),
                new Produto("Caminhonete1", 40000.0, "Caminhonete resistente", 12, new Categoria("Caminhonete"))
        ));

        // ArrayList de Pedido: inserir 2 pedidos com 3 respectivos itens cada.
        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        // Pedido 1
        PedidoItem pedidoItem1 = new PedidoItem("Sedan1", 2, listaProdutos);
        PedidoItem pedidoItem2 = new PedidoItem("SUV1", 1, listaProdutos);
        PedidoItem pedidoItem3 = new PedidoItem("Esportivo1", 3, listaProdutos);

        Pedido pedido1 = new Pedido(1, new Date(), 0, 1, new ArrayList<>(Arrays.asList(pedidoItem1, pedidoItem2, pedidoItem3)));

        // Pedido 2
        PedidoItem pedidoItem4 = new PedidoItem("Hatch1", 2, listaProdutos);
        PedidoItem pedidoItem5 = new PedidoItem("Caminhonete1", 1, listaProdutos);
        PedidoItem pedidoItem6 = new PedidoItem("SUV1", 3, listaProdutos);

        Pedido pedido2 = new Pedido(2, new Date(), 0, 1, new ArrayList<>(Arrays.asList(pedidoItem4, pedidoItem5, pedidoItem6)));

        // Adicionar pedidos à lista
        listaPedidos.addAll(Arrays.asList(pedido1, pedido2));

        // Realizar as validações
        for (Pedido pedido : listaPedidos) {
            for (PedidoItem item : pedido.getItensPedido()) {
                Produto produtoEncontrado = encontrarProduto(item, listaProdutos);
                if (produtoEncontrado != null) {
                    item.atualizaEstoqueItem();
                } else {
                    System.out.println("Produto não encontrado: " + item.getNomeItem());
                }
            }

            // Atualizar status do pedido para 2
            pedido.alterarStatus(2);

            // Calcular valor total a pagar
            double totalPagar = pedido.calcularTotalPagar();
            System.out.println("Pedido #" + pedido.getNumeroPedido() + ": Total a Pagar: $" + totalPagar);
        }

        // Mostrar estoque final e preço
        mostrarEstoqueEPreco(listaProdutos);
    }

    private static Produto encontrarProduto(PedidoItem item, ArrayList<Produto> listaProdutos) {
        for (Produto produto : listaProdutos) {
            if (produto.getNomeProduto().equalsIgnoreCase(item.getNomeItem())) {
                return produto;
            }
        }
        return null;
    }

    private static void mostrarEstoqueEPreco(ArrayList<Produto> listaProdutos) {
        System.out.println("\n----- Estoque Final e Preço dos Produtos -----");
        for (Produto produto : listaProdutos) {
            System.out.println("Produto: " + produto.getNomeProduto() +
                    " | Estoque Final: " + produto.getEstoqueAtual() +
                    " | Preço: $" + produto.getPrecoProduto());
        }
    }
}
