package edu.carlos.primeirasemana;

import java.util.concurrent.ThreadLocalRandom;

public class Repeticao {
    public static void main(String[] args) {
        // FOR
//        for(int carneiros = 1; carneiros < 21; carneiros++ ){
//            System.out.println("Contando carneirinhos " + carneiros);
//            System.out.println("Adoro dormir");
//        }

//        For em array
//        String alunos[] = {"Felipe", "Jonas", "Carlos", "Maria", "Marcos"};

//        for(int x = 0; x < alunos.length; x++){
//            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
//        }

//        String clientes[] = {"José", "João", "Pedro", "Angela", "Maria"};
//
//        for(int cliente = 1; cliente < clientes.length; cliente++){
//            System.out.println("Nome do(a) cliente número " + cliente + ": " + clientes[cliente]);
//        }

        // FOR / EACH
//        String listaCompras[] = {"Maçã", "Laranja", "Biscoito", "Macarrão", "Refrigerante", "Carne"};
//
//        System.out.println("Lista de compras");
//        for(String item : listaCompras){
//            System.out.println("Item da lista de compras: " + item);
//            System.out.println("----------------------------------------");
//        }

//        Break e Continue
//        for(int number = 1; number <= 5; number++){
//            if(number ==3)
//                continue;
//
//            System.out.println(number);
//        }

//        While
        double mesada = 50.0;
        while(mesada > 0){
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + "Adicionado ao carrinho!");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda a sua mesada em doces!");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}

