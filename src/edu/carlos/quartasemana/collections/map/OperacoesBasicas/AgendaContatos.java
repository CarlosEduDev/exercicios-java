package edu.carlos.quartasemana.collections.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Carlos", 362510);
        agendaContatos.adicionarContato("Carlos", 14250);
        agendaContatos.adicionarContato("Maria", 12345);
        agendaContatos.adicionarContato("João", 67841);
        agendaContatos.adicionarContato("Luan", 54321);

        agendaContatos.removerContato("João");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Carlos"));
    }
}
