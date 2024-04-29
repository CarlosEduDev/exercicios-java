package edu.carlos.primeirasemana;

public class Condicionais {

    //Condicional simples
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

        //Condicional composta
        int nota2 = 5;

        if(nota2 >= 6)
            System.out.println("Aprovado!!");
        else
            System.out.println("Reprovouu!");

        // Condicional ternário

        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);


    }


}