package edu.carlos.primeirasemana;

public class BoletimEscolar {
    public static void main(String[] args) {
        int mediaFinal = 5;
        if(mediaFinal < 6)
            System.out.println("Reprovado");
        else if(mediaFinal == 6)
            System.out.println("Passou arrastado");
        else
            System.out.println("Aprovado!");
    }
}
