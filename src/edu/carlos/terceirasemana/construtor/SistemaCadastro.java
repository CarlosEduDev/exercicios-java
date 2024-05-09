package edu.carlos.terceirasemana.construtor;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa carlos = new Pessoa("123", "Carlos");

        carlos.setEndereco("RUA DE LONDRES");

        System.out.println(carlos.getNome() + " - " + carlos.getCpf() + " " + carlos.getEndereco());

    }
}
