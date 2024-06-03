package edu.carlos.quartasemana.collections.set.Operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoparaRemover = null;
        
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoparaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoparaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado convidados = new ConjuntoConvidado();

        convidados.adicionarConvidado("João", 1);
        convidados.adicionarConvidado("Maria", 2);
        convidados.adicionarConvidado("Gabriel", 3);
        convidados.adicionarConvidado("Julia", 3);

        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro de Set de Convidados");

        convidados.removerConvidadoPorCodigoConvite(2);
        System.out.println("Existem " + convidados.contarConvidados() + " convidados dentro do Set de Convidados");

        convidados.exibirConvidados();
    }
}
