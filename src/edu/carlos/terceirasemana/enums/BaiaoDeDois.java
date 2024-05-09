package edu.carlos.terceirasemana.enums;

public class BaiaoDeDois {
    public static void main(String[] args) {
        System.out.println("Igredientes do baião de dois");
        for(IgredientesBaiaoDois e: IgredientesBaiaoDois.values()){
            System.out.println("Nome: " + e.getNome() + " | tipo: " + e.getTipo() + " | preço: " + e.getPreco() +
                    " reais");
        }
    }
}
