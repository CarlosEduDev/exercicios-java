package edu.carlos.quartasemana.collections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public int exibirQuantidadeContatos(){
        return contatoSet.size();
    }


    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato contato = new AgendaContato();

        contato.adicionarContato("Maria", 0);
        contato.adicionarContato("Maria", 548826535);
        contato.adicionarContato("João", 35147825);
        contato.adicionarContato("Breno", 65714287);
        contato.adicionarContato("Joana", 984755362);
        contato.adicionarContato("Camila", 984755362);

        System.out.println("Numero de contatos: " + contato.exibirQuantidadeContatos());
        contato.exibirContatos();

        System.out.println(contato.pesquisarPorNome("Breno"));

        contato.exibirContatos();
    }

}
