package edu.carlos.terceirasemana.enums;

public enum IgredientesBaiaoDois {
    ARROZ("Arroz", "grão", 18),
    BIFE("Bife", "Carne", 23),
    MACARRAO("Macarrão", "Massa", 6),
    FEIJAO("Feijão", "Legume", 16),
    TOMATE("Tomate", "Legume", 4);

    private String nome;
    private String tipo;
    private int preco;

    private IgredientesBaiaoDois(String nome, String tipo, int preco){
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPreco() {
        return preco;
    }
}
