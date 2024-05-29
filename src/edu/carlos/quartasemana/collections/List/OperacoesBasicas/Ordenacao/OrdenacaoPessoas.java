package edu.carlos.quartasemana.collections.List.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());

        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenarPessoas = new OrdenacaoPessoas();

        ordenarPessoas.adicionarPessoa("Carlos", 8, 1.60);
        ordenarPessoas.adicionarPessoa("João", 30, 1.80);
        ordenarPessoas.adicionarPessoa("Maria", 20, 1.56);

        System.out.println(ordenarPessoas.ordenarPorAltura());
        System.out.println(ordenarPessoas.ordenarPorIdade());
    }
}
