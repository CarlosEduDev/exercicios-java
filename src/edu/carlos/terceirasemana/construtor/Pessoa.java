package edu.carlos.terceirasemana.construtor;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // metodo construtor
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEndereco(String newEndereco) {
        endereco = newEndereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
