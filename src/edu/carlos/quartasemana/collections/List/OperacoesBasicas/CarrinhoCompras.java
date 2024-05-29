package edu.carlos.quartasemana.collections.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoCompras {
    List<Item> itemList = new ArrayList<>();

    public void carrinhoDeCompras(){
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        if(!this.itemList.isEmpty()){
            Iterator verItem = this.itemList.iterator();

            while (verItem.hasNext()){
                Item i = (Item)verItem.next();
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            this.itemList.removeAll(itensParaRemover);
        } else{
            System.out.println("Lista está vazia.");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        if (this.itemList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        } else {
            double valorItem;
            for(Iterator var3 = this.itemList.iterator(); var3.hasNext(); valorTotal += valorItem) {
                Item item = (Item)var3.next();
                valorItem = item.getPreco() * (double)item.getQuant();
            }

            return valorTotal;
        }
    }

    public void exibirLista(){
        if(!this.itemList.isEmpty()){
            System.out.println(this.itemList);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.exibirLista();

        carrinhoCompras.adicionarItem("Lapis", 2.0, 3);
        carrinhoCompras.adicionarItem("borracha", 1.5, 2);
        carrinhoCompras.adicionarItem("apontador", 2.5, 5);

        carrinhoCompras.removerItem("Lapis");
        carrinhoCompras.removerItem("borracha");
        carrinhoCompras.removerItem("apontador");

        carrinhoCompras.adicionarItem("estojo", 6.5, 1);

        carrinhoCompras.exibirLista();
    }

}
