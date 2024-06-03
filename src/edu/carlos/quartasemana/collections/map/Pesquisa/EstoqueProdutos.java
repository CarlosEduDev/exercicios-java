package edu.carlos.quartasemana.collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long code, String nome, double preco, int quant){
        estoqueProdutosMap.put(code, new Produto(nome, preco, quant));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()){
         for(Produto p : estoqueProdutosMap.values()){
            if (p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
         }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Arroz", 10.99, 2);
        estoqueProdutos.adicionarProduto(2, "Feijão", 15.90, 3);
        estoqueProdutos.adicionarProduto(3, "Macarrão", 6.50, 4);

        estoqueProdutos.exibirProdutos();

        System.out.println("O valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("O produto mais cara: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}